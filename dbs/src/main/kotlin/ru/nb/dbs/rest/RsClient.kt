package ru.nb.dbs.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Component
class RsClient(
	@Value("\${rs.url}") private val rsUrl: String
) {

	val msClient: WebClient = WebClient.create(rsUrl)

	suspend fun getData(): String {
		return msClient
			.get()
			.uri("test")
			.retrieve()
			.awaitBody()
	}

}