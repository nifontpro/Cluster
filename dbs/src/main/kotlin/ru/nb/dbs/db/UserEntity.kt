package ru.nb.dbs.db

import jakarta.persistence.*

@Entity
@Table(name = "usr", schema = "usr", catalog = "medalist")
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