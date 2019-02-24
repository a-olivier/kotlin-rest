package com.aol.kotlin.rest

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RestApplication{

	@Bean
	fun init(repository : CustomerRepository) = CommandLineRunner{
		repository.save(Customer("Jack", "Bauer"))
		repository.save(Customer("Chloe", "O'Brian"))
		repository.save(Customer("Kim", "Bauer"))
		repository.save(Customer("David", "Palmer"))
		repository.save(Customer("Michelle", "Dessler"))
	}

}

fun main(args: Array<String>) {
	runApplication<RestApplication>(*args)
}
