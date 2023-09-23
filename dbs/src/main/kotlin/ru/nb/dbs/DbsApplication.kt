package ru.nb.dbs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbsApplication

fun main(args: Array<String>) {
	runApplication<DbsApplication>(*args)
}
