package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Artist;
import com.jgfontes.recordingcrud.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public Artist findByName(String artistName) {
        return artistRepository.findByName(artistName);
    }

    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    public void deleteById(int artistId) {
        artistRepository.deleteById(artistId);
    }
}
