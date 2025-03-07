package org.openapitools

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["org.openapitools", "com.example.openapigenerator.kotlin.spring.apis", "com.example.openapigenerator.kotlin.spring.models"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
