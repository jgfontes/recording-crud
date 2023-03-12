package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;

@Entity(name="Category")
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_category;

    @Column(nullable = false)
    private String desc_category;

    public category() {
    }

    public category(int cod_category, String desc_category) {
        this.cod_category = cod_category;
        this.desc_category = desc_category;
    }
}
