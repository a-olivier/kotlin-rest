package com.aol.kotlin.rest

import com.aol.kotlin.rest.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController (val repository: CustomerRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{name}")
    fun findByName(@PathVariable name:String) = repository.findByName(name)
}