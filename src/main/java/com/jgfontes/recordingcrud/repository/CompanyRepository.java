package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
