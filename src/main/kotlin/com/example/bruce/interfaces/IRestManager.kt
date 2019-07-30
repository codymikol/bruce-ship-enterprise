package com.example.bruce.interfaces

interface IRestManager <T> {
    fun getOne(id: T): Any
    fun getAll(): Any
    fun update(id: T): Any
    fun create(): Any
    fun delete(id: T): Any
}