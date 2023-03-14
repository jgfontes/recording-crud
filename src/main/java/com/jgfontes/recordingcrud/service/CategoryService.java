package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
     CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
