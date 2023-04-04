package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;

@Entity(name="Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_category;

    @Column(nullable = false)
    private String description;

    public Category() {
    }

    public Category(String desc_category) {
        this.description = desc_category;
    }

    public void setCod_category(int cod_category) {
        this.cod_category = cod_category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cod_category=" + cod_category +
                ", desc_category='" + description + '\'' +
                '}';
    }
}
