package com.jgfontes.recordingcrud.controller;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.findAll();
    }
}
