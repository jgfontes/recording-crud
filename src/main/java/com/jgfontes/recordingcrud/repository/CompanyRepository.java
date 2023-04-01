package com.jgfontes.recordingcrud.repository;

import com.jgfontes.recordingcrud.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query(value = "SELECT * FROM public.company WHERE company_name = ?1", nativeQuery = true)
    Company findByName(String companyName);
}
