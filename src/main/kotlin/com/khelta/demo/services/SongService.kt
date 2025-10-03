package com.khelta.demo.services

import com.khelta.demo.entities.Song
import com.khelta.demo.repositories.SongRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SongService(private val songRepository: SongRepository) {
    fun getSongs(): List<Song> = songRepository.findAll()

    fun saveSong(song: Song): Song = songRepository.save(song)

    fun getSongById(id: Long): Song? = songRepository.findByIdOrNull(id)

    fun deleteSongById(id: Long) = songRepository.deleteById(id)
}