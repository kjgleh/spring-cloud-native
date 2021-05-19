package me.kjgleh.springcloudnative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudNativeApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudNativeApplication>(*args)
}
