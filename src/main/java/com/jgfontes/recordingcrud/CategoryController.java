package com.jgfontes.recordingcrud;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

}
