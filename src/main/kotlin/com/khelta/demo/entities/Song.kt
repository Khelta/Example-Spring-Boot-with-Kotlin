package com.khelta.demo.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Song(
    @Id val id: Long?,
    val artist: String,
    val title: String,
    val text: String
)