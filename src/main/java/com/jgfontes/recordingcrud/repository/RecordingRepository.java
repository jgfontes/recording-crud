package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Recording;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordingRepository extends JpaRepository<Recording, Integer> {
}
