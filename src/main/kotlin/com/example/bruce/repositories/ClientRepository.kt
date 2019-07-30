package com.example.bruce.repositories

import com.example.bruce.domain.Client
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ClientRepository : JpaRepository<Client, UUID> {}