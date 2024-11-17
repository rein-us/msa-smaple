package com.msa.study.config.msasample.example1.presentation

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {
    @GetMapping(path = ["/live"], produces = ["application/json"])
    fun live() = ResponseEntity.ok().build<Any?>()
}
