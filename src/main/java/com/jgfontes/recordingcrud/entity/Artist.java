package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_artist;

    @Column(nullable = false)
    private String artist_name;

    @Column(nullable = false)
    private String country;
}
