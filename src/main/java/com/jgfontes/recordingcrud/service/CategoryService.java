package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
     CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(int categoryId) {
        return categoryRepository.findById(categoryId);
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(int categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
