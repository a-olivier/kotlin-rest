package com.aol.kotlin.rest

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer,Long> {
    fun findByName(name: String): List<Customer>
}