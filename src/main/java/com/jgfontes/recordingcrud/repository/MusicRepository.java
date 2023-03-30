package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Music;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM music WHERE cod_music = ?1", nativeQuery = true)
     public void deleteById(int musicId);
}
