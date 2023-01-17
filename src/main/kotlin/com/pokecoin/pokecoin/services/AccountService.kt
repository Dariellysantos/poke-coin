package com.pokecoin.pokecoin.services

import com.pokecoin.pokecoin.entities.Account
import com.pokecoin.pokecoin.repository.AccountRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class AccountService(
    val accountRepository: AccountRepository
) {
    fun create(account: Account): Account{
       return accountRepository.save(account)
    }

    fun findAll(): MutableList<Account> {
       return accountRepository.findAll()
    }

    fun findByHistoric(id:UUID){
        accountRepository.findById(id)
    }
}