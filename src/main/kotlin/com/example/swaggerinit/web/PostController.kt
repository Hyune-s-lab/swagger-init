package com.example.swaggerinit.web

import com.example.swaggerinit.web.request.PostRequest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(private val map: HashMap<String, String>) {
    @GetMapping("/api/v1/posts")
    fun get(): HashMap<String, String> {
        return map
    }

    @PostMapping("/api/v1/posts")
    fun post(@RequestBody request: PostRequest) {
        log.info("### ${request.title}")
        map[map.size.toString()] = request.title
    }

    private val log: Logger = LoggerFactory.getLogger(this::class.java)
}
