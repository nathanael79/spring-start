package com.learn.springstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringStartApplication

fun main(args: Array<String>) {
	runApplication<SpringStartApplication>(*args)
}
