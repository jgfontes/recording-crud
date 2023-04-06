package com.jgfontes.recordingcrud.controller;

import com.jgfontes.recordingcrud.entity.Artist;
import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category/findAll")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/category/findById")
    public Category findById(@RequestParam String id) {
        return categoryService.findById(Integer.parseInt(id)).get();
    }

    @PostMapping (path = "/category/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            headers = "content-type=text/json")
    public Category create(@RequestBody Category category) {
        System.out.println(category);
        return categoryService.save(category);
    }

    @DeleteMapping(path = "/category/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        categoryService.deleteById(Integer.parseInt(id));
    }
}
