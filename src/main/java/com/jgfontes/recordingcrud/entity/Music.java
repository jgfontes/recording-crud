package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "Music")
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_music;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_key", referencedColumnName = "cod_category")
    private Category category;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private String title;
}
