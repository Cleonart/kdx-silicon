package com.kdx.jkt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KdxApplication

fun main(args: Array<String>) {
	runApplication<KdxApplication>(*args)
}
