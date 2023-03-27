package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Music;
import com.jgfontes.recordingcrud.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    public Music save(Music music) {
        return musicRepository.save(music);
    }

    public void deleteById(int musicId) {
         musicRepository.deleteById(musicId);
    }
}
