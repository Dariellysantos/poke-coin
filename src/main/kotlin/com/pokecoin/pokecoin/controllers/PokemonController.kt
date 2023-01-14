package com.pokecoin.pokecoin.controllers

import com.pokecoin.pokecoin.entities.Pokemon
import com.pokecoin.pokecoin.services.PokemonService
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
@RequestMapping
class PokemonController(
    val pokemonService: PokemonService
){
    @GetMapping("/{name}")
    fun getPokemonByName(@PathVariable name: String) =
        pokemonService.findPokemonById(name)
}