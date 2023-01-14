package com.pokecoin.pokecoin.entities

import com.fasterxml.jackson.annotation.JsonAutoDetect

class Pokemon(
        val name: String,
        val levels: List<Levels>
)