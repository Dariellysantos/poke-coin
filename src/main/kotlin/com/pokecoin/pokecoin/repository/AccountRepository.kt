package com.pokecoin.pokecoin.repository

import com.pokecoin.pokecoin.entities.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.UUID

@Repository
interface AccountRepository: JpaRepository<Account,UUID>



