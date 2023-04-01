package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.entity.Music;
import com.jgfontes.recordingcrud.repository.CategoryRepository;
import com.jgfontes.recordingcrud.repository.MusicRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    MusicRepository musicRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    public Music findByName(String musicName) {
        Music foundMusic = musicRepository.findByName(musicName);
        Category foundCategory = categoryRepository.findCategoryByMusicName(musicName);
        foundMusic.setCategory(foundCategory);
        return foundMusic;
    }

    public Music save(Music music) {return musicRepository.save(music);}

    public void deleteById(int musicId) {
         musicRepository.deleteById(musicId);
    }
}
