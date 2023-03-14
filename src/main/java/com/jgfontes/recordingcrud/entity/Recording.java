package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Recording {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod_recording;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_key", referencedColumnName = "cod_company")
    private Company company;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_key", referencedColumnName = "cod_artist")
    private Artist artist;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "music_key", referencedColumnName = "cod_music")
    private Music music;

    @Column()
    private LocalDate recording_date;
}
