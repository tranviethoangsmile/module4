package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class MusicForm {
    private int id;
    private String name;
    private String description;
    private MultipartFile musicfile;

    public MusicForm() {
    }

    public MusicForm(int id, String name, String description, MultipartFile musicfile) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.musicfile = musicfile;
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

    public MultipartFile getMusicfile() {
        return musicfile;
    }

    public void setMusicfile(MultipartFile musicfile) {
        this.musicfile = musicfile;
    }
}
