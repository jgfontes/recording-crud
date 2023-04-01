package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
