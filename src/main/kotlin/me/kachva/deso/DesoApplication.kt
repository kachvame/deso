package me.kachva.deso

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DesoApplication

fun main(args: Array<String>) {
    runApplication<DesoApplication>(*args)
}
