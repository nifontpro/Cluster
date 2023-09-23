package ru.nb.rs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RsApplication

fun main(args: Array<String>) {
	runApplication<RsApplication>(*args)
}
