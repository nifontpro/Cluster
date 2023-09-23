package ru.nb.dbs.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.nb.dbs.db.UserEntity
import ru.nb.dbs.db.UserService

@RestController
class UserController(
	private val userService: UserService,
	private val rsClient: RsClient,
) {

	@GetMapping("all")
	fun getAll():List<UserEntity> {
		return userService.findAll()
	}

	@GetMapping("test")
	suspend fun test() = "Test data, data from Rs: ${rsClient.getData()}"

}