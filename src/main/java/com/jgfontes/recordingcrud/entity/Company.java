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
    private String name;

    @Column(nullable = false)
    private String country;

    public Company(String company_name, String country) {
        this.name = company_name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cod_company=" + cod_company +
                ", company_name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
