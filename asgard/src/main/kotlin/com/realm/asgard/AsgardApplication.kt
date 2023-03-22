package com.realm.asgard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AsgardApplication

fun main(args: Array<String>) {
	runApplication<AsgardApplication>(*args)
}
