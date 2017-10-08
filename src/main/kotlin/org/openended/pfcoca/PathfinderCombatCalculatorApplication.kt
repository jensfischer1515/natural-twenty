package org.openended.pfcoca

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PathfinderCombatCalculatorApplication

fun main(args: Array<String>) {
    SpringApplication.run(PathfinderCombatCalculatorApplication::class.java, *args)
}
