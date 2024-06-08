package com.awake.spring.docker.compose.demo.repo

import com.awake.spring.docker.compose.demo.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}