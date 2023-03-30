package com.jgfontes.recordingcrud;

import com.jgfontes.recordingcrud.entity.Category;
import com.jgfontes.recordingcrud.entity.Music;
import com.jgfontes.recordingcrud.service.CategoryService;
import com.jgfontes.recordingcrud.service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
public class RecordingCrudApplication {

	private static final Logger log = LoggerFactory.getLogger(RecordingCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecordingCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CategoryService categoryService, MusicService musicService) {
		return (args -> {
//			CATEGORIES TEST
//			System.out.println("Create category test");
//			System.out.println("______________________\n");
//			Category punkCategory = new Category("Punk Rock test");
//			System.out.println(punkCategory);
//			categoryService.saveCategory(punkCategory);
//			System.out.println("______________________\n");
//
//			System.out.println("Delete");
//			System.out.println("______________________\n");
//			List.of(102, 152, 202, 252, 302).forEach(categoryId -> {
//				categoryService.delete(categoryId);
//			});
//			System.out.println("______________________\n");

//			System.out.println("Find all categories");
//			System.out.println("______________________\n");
//			List<Category> categoriesListFound = categoryService.findAll();
//			categoriesListFound.stream().forEach(System.out::println);
//			System.out.println("______________________\n");

//			//MUSIC TEST
//			System.out.println("Create Song");
//			System.out.println("______________________\n");
//			Optional<Category> category = categoryService.findById(1);
//			System.out.println(category.get());
//			Music newMusic = new Music("Master of Puppets", 836, category.get());
//			newMusic.setCod_music(105);
//			System.out.println(newMusic);
//			musicService.save(newMusic);
//			System.out.println("______________________\n");
//
//			musicService.deleteById(352);
//
//			System.out.println("Find all musics");
//			System.out.println("______________________\n");
//			List<Music> MusicListFound = musicService.findAll();
//			MusicListFound.forEach(System.out::println);
//			System.out.println("______________________\n");

//			COMPANIES TEST

		});
	}
}
