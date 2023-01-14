package com.pokecoin.pokecoin

import io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient
import java.net.http.HttpHeaders
import java.util.jar.Attributes.Name.CONTENT_TYPE

@SpringBootApplication
class PokeCoinApplication{

}
	fun main(args: Array<String>) {
		runApplication<PokeCoinApplication>(*args)
	}
