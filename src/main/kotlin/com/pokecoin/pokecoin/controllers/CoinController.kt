package com.pokecoin.pokecoin.controllers

import com.pokecoin.pokecoin.services.CoinService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/coin")
class CoinController (
    val coinService: CoinService
){
    @GetMapping("/")
    fun getPokemonByName() =
        coinService.findPokemonById()
}