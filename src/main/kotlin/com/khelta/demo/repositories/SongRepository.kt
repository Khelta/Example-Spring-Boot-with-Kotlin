package com.khelta.demo.repositories

import com.khelta.demo.entities.Song
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SongRepository : JpaRepository<Song, Long>