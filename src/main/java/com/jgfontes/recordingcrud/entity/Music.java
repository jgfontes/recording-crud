package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "Music")
@NoArgsConstructor
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_music;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "category_key", referencedColumnName = "cod_category")
    private Category category;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private String title;

    public void setCod_music(int cod_music) {
        this.cod_music = cod_music;
    }

    public Music(String title, int duration, Category category) {
        this.title = title;
        this.duration = duration;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Music{" +
                "cod_music=" + cod_music +
                ", category=" + category +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                '}';
    }
}
