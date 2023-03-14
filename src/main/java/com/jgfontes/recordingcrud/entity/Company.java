package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_company;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String country;
}
