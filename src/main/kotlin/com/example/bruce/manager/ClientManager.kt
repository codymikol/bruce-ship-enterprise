package com.example.bruce.manager

import com.example.bruce.domain.Client
import com.example.bruce.interfaces.IRestManager
import com.example.bruce.repositories.ClientRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientManager(val clientRepository: ClientRepository) : IRestManager<UUID> {

    override fun getOne(id: UUID) : List<Client> {
        return clientRepository.findOne(id)
    }

    override fun getAll() {
        return clientRepository.findAll()
    }

    override fun update() {
        //TODO Update logic
    }

    override fun create() {
        //TODO Create logic
    }

    override fun delete() {
        //TODO Delete logic
    }

}