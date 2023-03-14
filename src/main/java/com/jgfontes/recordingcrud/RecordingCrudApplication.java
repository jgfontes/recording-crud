package com.jgfontes.recordingcrud;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class RecordingCrudApplication {

	private static final Logger log = LoggerFactory.getLogger(RecordingCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecordingCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CategoryService categoryService) {
		return (args -> {
			System.out.println("Find all categories");
			System.out.println("______________________\n");
			List<Category> categoriesListFound = categoryService.findAll();
			categoriesListFound.stream().forEach(System.out::println);
			System.out.println("______________________\n");
		});
	}
}
