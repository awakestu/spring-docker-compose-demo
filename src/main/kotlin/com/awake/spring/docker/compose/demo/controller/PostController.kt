package com.awake.spring.docker.compose.demo.controller

import com.awake.spring.docker.compose.demo.repo.PostRepository
import com.awake.spring.docker.compose.demo.model.Post
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController(val repository: PostRepository) {

    @GetMapping
    fun listPosts(): List<Post> {
        return repository.findAll()
    }
}