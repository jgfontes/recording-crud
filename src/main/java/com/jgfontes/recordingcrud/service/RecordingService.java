package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Recording;
import com.jgfontes.recordingcrud.repository.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordingService {

    @Autowired
    RecordingRepository recordingRepository;

    public List<Recording> findAll() {
        return recordingRepository.findAll();
    }

    public Recording save(Recording recording) {
        return recordingRepository.save(recording);
    }
}
