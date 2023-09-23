package ru.nb.dbs.db

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class UserService(
	private val userRepo: UserRepo
) {

	fun findAll(): List<UserEntity> {
		return userRepo.findAll()
	}

	fun insert(userEntity: UserEntity) {
		userRepo.save(userEntity)
	}

}