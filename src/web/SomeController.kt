package web

import util.Routes

@RestController
@RequestMapping
class SomeController {
    @PostMapping(Routes.update)
    @ResponseStatus(HttpStatus.OK)
    fun updateLoginFunc(
        @PathVariable("loginNumber") loginNumber: Int,
    ): String = "Login number updated: $loginNumber"

    @DeleteMapping(Routes.deleteUser)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"
}
