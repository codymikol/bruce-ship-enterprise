package com.example.bruce.controller

import com.example.bruce.domain.Version
import com.example.bruce.interfaces.IRestController
import com.example.bruce.repositories.VersionRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(VersionController.BASE_URL)
class VersionController(val versionRepository: VersionRepository) : IRestController {
    override fun getOne(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        const val BASE_URL = "/bruce/v1/"
    }

    override fun update(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //TODO: This should be available via the admin interface
    @GetMapping("/version")
    override fun getAll(): List<Version> {
        return versionRepository.findAll()
    }

    //TODO: This should be accessible via a gitlab role, gitlab makes a post here when a new version is cut.
    @PostMapping("/version")
    override fun create(): String {
        return "test"
    }

}