package dev.spring.chat

import org.springframework.ai.chat.client.ChatClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class ChatApplication

fun main(args: Array<String>) {
	runApplication<ChatApplication>(*args)
}

@Configuration
internal class Config {
	@Bean
	fun chatClient(builder: ChatClient.Builder): ChatClient {
		return builder
			.defaultSystem("The joke should not involve viruses")
			.build()
	}
}

@RestController
internal class AIController(private val chatClient: ChatClient) {
	@GetMapping("/chatai")
	fun completion(
		@RequestParam(
			value = "message",
			defaultValue = "Tell me a joke about IT industry"
		) message: String?
	): Map<String, String> {
		return mapOf(
			"completion" to
			chatClient.prompt()
				.user(message)
				.call()
				.content()
		)
	}
}