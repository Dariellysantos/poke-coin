package com.pokecoin.pokecoin.entities

import com.fasterxml.jackson.annotation.JsonProperty


class Coin (
       @JsonProperty("USD")
       val usd: Usd
)