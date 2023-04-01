package com.jgfontes.recordingcrud.service;

import com.jgfontes.recordingcrud.entity.Company;
import com.jgfontes.recordingcrud.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public void deleteById(int companyId) {
        companyRepository.deleteById(companyId);
    }

    public Company findByName(String companyName) {
        return companyRepository.findByName(companyName);
    }
}
