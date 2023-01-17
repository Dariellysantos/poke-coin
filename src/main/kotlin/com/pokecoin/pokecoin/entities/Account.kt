package com.pokecoin.pokecoin.entities

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "account")
data class Account(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID,

    @Column
    val email: String,

    @Embedded
    val catalog: List<Pokemons>? = null,

    @Column
    val recipe: Long? = null,

    @Embedded
    val historic: List<Historic>? = null,

    @Column
    val wallet: Long? = null,
){
    @Embeddable
    class Pokemons(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: UUID? = null,

        @Column
        val name: String? = null,

        @Column
        val level: Long? = null,

        @Column
        val experience: Long? = null
    )

    @Embeddable
    class Historic(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: UUID? = null,

        @Column
        val sales: String? = null,

        @Column
        val acquisition: String? = null
    )
}