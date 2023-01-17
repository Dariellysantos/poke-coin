package com.pokecoin.pokecoin.services

import com.pokecoin.pokecoin.entities.Pokemon
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.RequestEntity.method
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToFlux
import reactor.core.publisher.Mono

private val baseUrl = "https://pokeapi.co/api/v2/growth-rate"

@Service
class PokemonService (
    val webClient: WebClient
){

    fun findPokemonById(name:String): Mono<Pokemon>{
        return webClient
            .get()
            .uri("$baseUrl/$name")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Pokemon::class.java)
    }
}