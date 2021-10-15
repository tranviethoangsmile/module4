package com.codegym.model;

import javax.persistence.*;

@Entity
@Table (name = "Music")
public class Music {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String musicfile;

    public Music() {
    }

    public Music(int id, String name, String description, String musicfile) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.musicfile = musicfile;
    }

    public Music(String name, String description, String filename) {
        this.name = name;
        this.description = description;
        this.musicfile = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMusicfile() {
        return musicfile;
    }

    public void setMusicfile(String musicfile) {
        this.musicfile = musicfile;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", musicfile='" + musicfile + '\'' +
                '}';
    }
}
