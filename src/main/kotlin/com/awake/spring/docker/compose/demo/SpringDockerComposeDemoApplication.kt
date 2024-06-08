package com.awake.spring.docker.compose.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDockerComposeDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringDockerComposeDemoApplication>(*args)
}
