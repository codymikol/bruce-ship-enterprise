package com.example.bruce.domain

import com.example.bruce.repositories.ClientRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import java.math.BigDecimal

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest
class ClientTest {

    @Autowired
    private val clientRepository: ClientRepository? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {

    }

    @Test
    fun testPersistence() {

        //when
        val clients = clientRepository!!.findAll();

        //then
        Assert.assertNotNull(clients)
    }

    companion object {
    }
}