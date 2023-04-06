package com.jgfontes.recordingcrud.controller;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.jgfontes.recordingcrud.entity.Artist;
import com.jgfontes.recordingcrud.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArtistController {

    @Autowired
    public ArtistService artistService;

    @GetMapping(value = "/artist/findAll")
    public List<Artist> getArtists() {
        return artistService.findAll();
    }

    @GetMapping(value = "/artist/findByName/name")
    public Artist getByName(@RequestParam String name) {
        return artistService.findByName(name);
    }

    @PostMapping (path = "/artist/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            headers = "content-type=text/json")
    public Artist create(@RequestBody Artist artist) {
        System.out.println(artist);
        return artistService.save(artist);
    }

    @DeleteMapping(value = "/artist/deleteById/{id}")
    public void delete(@PathVariable String id)  {
        artistService.deleteById(Integer.parseInt(id));
    }

}
