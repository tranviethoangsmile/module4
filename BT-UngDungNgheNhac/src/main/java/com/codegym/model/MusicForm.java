package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class MusicForm implements Validator {
    private int id;
    @NotEmpty
    @Min(value = 4)
    private String name;
    @NotEmpty
    @Min(value = 10)
    private String description;
    @NotEmpty
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        MusicForm musicForm = (MusicForm) target;
        String name = musicForm.getName();
        if(name == null || "".equals(name)) {
            errors.rejectValue("name","name","khong dung");
        }
    }
}
