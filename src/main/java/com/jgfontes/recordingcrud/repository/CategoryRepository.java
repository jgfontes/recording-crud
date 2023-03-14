package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
