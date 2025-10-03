package com.khelta.demo.controller

import com.khelta.demo.entities.Song
import com.khelta.demo.services.SongService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@Controller
@ResponseBody
@RequestMapping("/song")
class SongController(private val songService: SongService) {
    @GetMapping("")
    fun getSongs(): List<Song> = songService.getSongs()

    @RequestMapping(method = [RequestMethod.POST, RequestMethod.PUT])
    fun writeSong(@RequestBody song: Song): Song = songService.saveSong(song)

    @GetMapping("/{id}")
    fun getSongById(@PathVariable id: Long): Song =
        songService.getSongById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "No song found for $id")

    @DeleteMapping("/{id}")
    fun deleteSongById(@PathVariable id: Long) = songService.deleteSongById(id)
}