package com.example.bruce.controller

import com.example.bruce.domain.Client
import com.example.bruce.interfaces.IRestController
import com.example.bruce.manager.ClientManager
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(ClientController.BASE_URL)
class ClientController(val clientManager: ClientManager) : IRestController<UUID> {

    companion object {
        const val BASE_URL = "/bruce/v1/client"
        const val EXTENSION = "/{id}"
    }

    @DeleteMapping(EXTENSION)
    override fun delete(@PathVariable id: UUID) {
        return clientManager.delete(id)
    }

    @GetMapping()
    override fun getAll(): List<Client> {
        return clientManager.getAll()
    }

    @GetMapping(EXTENSION)
    override fun getOne(@PathVariable id: UUID): String {
        return clientManager.getOne(id)
    }

    @PostMapping()
    override fun create(): String {
        return clientManager.create()
    }

    @PutMapping(EXTENSION)
    override fun update(@PathVariable id:UUID): Any {
        return clientManager.update(id)
    }

}