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
    private String artist_name;

    @Column(nullable = false)
    private String country;

    public Artist(String artist_name, String country) {
        this.artist_name = artist_name;
        this.country = country;
    }

    public int getCod_artist() {
        return cod_artist;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "cod_artist=" + cod_artist +
                ", artist_name='" + artist_name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
