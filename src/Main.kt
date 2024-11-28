import com.apple.eawt.Application
import io.ktor.application.*
import io.ktor.http.HttpStatusCode
import io.ktor.features.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.jackson.jackson
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.request.ApplicationRequest
import io.ktor.server.response.ApplicationResponse
import io.ktor.server.routing.routing
import io.ktor.server.application.call

// Define constant base route
const val BASE_API_ROUTE = "/blabla/api/v1"

fun Application.module() {
    // Install features like content negotiation for JSON
    install(ContentNegotiation) {
        jackson { }
    }

    // Install StatusPages to handle errors (optional)
    install(StatusPages) {
        exception<Throwable> { cause ->
            call.respond(HttpStatusCode.InternalServerError, cause.localizedMessage)
        }
    }

    routing {
        // Define API routes inside the base route
        route(BASE_API_ROUTE) {
            get("/copy") {
                call.respond(HttpStatusCode.OK, "This is the Copy API endpoint")
            }
            get("/paste") {
                call.respond(HttpStatusCode.OK, "This is the Paste API endpoint")
            }
            get("/blabla") {
                call.respond(HttpStatusCode.OK, "This is the Another API endpoint")
            }
            get("/another") {
                call.respond(HttpStatusCode.OK, "This is the Another API endpoint")
            }
        }
    }
}

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}
