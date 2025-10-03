package com.khelta.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Controller {

    @GetMapping("")
    fun index(): String {
        return "Hello World!"
    }
}