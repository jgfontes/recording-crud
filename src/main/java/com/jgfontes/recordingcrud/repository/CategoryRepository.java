package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT * FROM category WHERE cod_category = (SELECT category_key FROM music WHERE title = 'Master of Puppets')", nativeQuery = true)
    public Category findCategoryByMusicName(String musicName);
}
