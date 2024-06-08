package com.awake.spring.docker.compose.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Post(

    @Id
    @GeneratedValue
    var id: Long,

    var title: String,

    var content: String,
) {
}