package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    @Query(value = "SELECT * FROM public.artist WHERE artist_name = 'Metallica'", nativeQuery = true)
    Artist findByName(String artistName);
}
