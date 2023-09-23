package ru.nb.dbs.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.nb.dbs.db.UserEntity

@Repository
interface UserRepo: JpaRepository<UserEntity, Long>