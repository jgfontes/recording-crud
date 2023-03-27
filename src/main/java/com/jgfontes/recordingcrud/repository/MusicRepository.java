package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

}
