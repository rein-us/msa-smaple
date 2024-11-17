package com.msa.study.config.msasample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsaSampleApplication

fun main(args: Array<String>) {
    runApplication<MsaSampleApplication>(*args)
}
