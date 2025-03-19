package web

import util.Application
import util.Constants.Companion.BLABLA_BASE
import util.Constants.Companion.SECONDS_BASE
import util.Constants2
import util.Constants2.MyObject
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


    @DeleteMapping(Application.SECURED_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Application.INTERNAL_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(BLABLA_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(SECONDS_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(MyObject.HELLO)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Constants2.WORLD)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Constants2.WORLD)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user222: $userId"

}
