package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_company;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String country;

    public Company(String company_name, String country) {
        this.company_name = company_name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cod_company=" + cod_company +
                ", company_name='" + company_name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
