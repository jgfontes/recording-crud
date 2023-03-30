package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Company;
import com.jgfontes.recordingcrud.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company save(Company company) {
        return companyRepository.save(company);

    }
}
