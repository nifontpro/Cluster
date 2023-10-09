package ru.nb.dbs.db

import jakarta.persistence.*

@Entity
@Table(name = "user_data", schema = "users", catalog = "medalist")
class UserEntity(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long? = null,
	val firstname: String? = null
) {
	override fun toString(): String {
		return "{id: $id, firstname: $firstname}"
	}
}