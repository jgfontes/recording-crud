package com.jgfontes.recordingcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
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

    public Recording(Company company, Artist artist, Music music, LocalDate recording_date) {
        this.company = company;
        this.artist = artist;
        this.music = music;
        this.recording_date = recording_date;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "cod_recording=" + cod_recording +
                ", company=" + company +
                ", artist=" + artist +
                ", music=" + music +
                ", recording_date=" + recording_date +
                '}';
    }
}
