package com.pokecoin.pokecoin.controllers

import com.pokecoin.pokecoin.entities.Account
import com.pokecoin.pokecoin.services.AccountService
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/account")
class AccountController(
    private val accountService: AccountService
) {
    @Transactional
    @PostMapping("/")
    fun saveAccount(@RequestBody  account: Account) =
         accountService.create(account)

    @Transactional
    @GetMapping("/")
    fun findAll() =
        accountService.findAll()

    @Transactional
    @GetMapping("/find")
    fun findHistoric(id:UUID) =
        accountService.findByHistoric(id)

}