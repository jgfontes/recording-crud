package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_artist;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    public Artist(String artist_name, String country) {
        this.name = artist_name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "cod_artist=" + cod_artist +
                ", artist_name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
