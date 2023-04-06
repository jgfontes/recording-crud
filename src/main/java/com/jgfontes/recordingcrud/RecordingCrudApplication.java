package com.jgfontes.recordingcrud;

import com.jgfontes.recordingcrud.entity.*;
import com.jgfontes.recordingcrud.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	public CommandLineRunner demo(CategoryService categoryService, MusicService musicService, CompanyService companyService, ArtistService artistService, RecordingService recordingService) {
		return (args -> {
			System.out.println(categoryService.findAll());
//			testCategory(categoryService);
//			testMusic(musicService, categoryService);
//			testCompany(companyService);
//			testArtist(artistService);

//			//TEST RECORDING FLOW BELOW
//			musicService.findAll().forEach(System.out::println);
//			companyService.findAll().forEach(System.out::println);
//			artistService.findAll().forEach(System.out::println);
//
//			Recording recording = new Recording(
//				companyService.findByName("Elektra Records"),
//				artistService.findByName("Metallica"),
//				musicService.findByName("Master of Puppets"),
//				LocalDate.parse("2012-12-03", DateTimeFormatter.ISO_LOCAL_DATE)
//			);
//			recording.setCod_recording(103);
//
//			System.out.println(recording);
//			recordingService.save(recording);

		});
	}

	public void testCategory(CategoryService categoryService) {
			System.out.println("Create category test");
			System.out.println("______________________\n");
			Category punkCategory = new Category("Punk Rock test");
			System.out.println(punkCategory);
			categoryService.save(punkCategory);
			System.out.println("______________________\n");
//
			System.out.println("Delete");
			System.out.println("______________________\n");
			List.of(102, 152, 202, 252, 302).forEach(categoryId -> {
				categoryService.delete(categoryId);
			});
			System.out.println("______________________\n");

			System.out.println("Find all categories");
			System.out.println("______________________\n");
			List<Category> categoriesListFound = categoryService.findAll();
			categoriesListFound.stream().forEach(System.out::println);
			System.out.println("______________________\n");
	}

	public void testMusic(MusicService musicService, CategoryService categoryService) {
		Optional<Category> category = categoryService.findById(1);
		System.out.println(category.get());
		Music newMusic = new Music("Master of Puppets", 836, category.get());
		newMusic.setCod_music(106);
		//Fix the bug below
		musicService.save(newMusic);
		List<Music> musicList = musicService.findAll();
		musicList.forEach(System.out::println);
	}

	public void testCompany(CompanyService companyService) {
		List.of(
			new Company("Abbey Road", "UK"),
			new Company("Elektra Records", "USA"),
			new Company("Blackbird Studio", "USA"),
			new Company("ONKIO HAUS", "Japan")
		).forEach(company -> {
			companyService.save(company);
		});
		List<Company> companies = companyService.findAll();
		companies.forEach(System.out::println);
	}

	public void testArtist(ArtistService artistService) {
		Artist artist = new Artist("Metallica", "USA");
		Artist artist2 = new Artist("Iron Maiden", "UK");
		Artist artist3 = new Artist("Scorpions", "Germany");
		List.of(artist, artist2, artist3).forEach(eachArtist -> {
			artistService.save(eachArtist);
		});
		List<Artist> artists = artistService.findAll();
		artists.forEach(System.out::println);
	}

	public void testArtist() {

	}
}
