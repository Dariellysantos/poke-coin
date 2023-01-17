package com.pokecoin.pokecoin.services

import com.pokecoin.pokecoin.entities.Coin
import com.pokecoin.pokecoin.entities.Usd
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

private val baseUrl = "https://blockchain.info/ticker"

@Service
class CoinService(
    val webClient: WebClient
) {
    fun findPokemonById(): Usd {
        val response = webClient
            .get()
            .uri(baseUrl)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Coin::class.java)
        return response.block()!!.usd
    }
}