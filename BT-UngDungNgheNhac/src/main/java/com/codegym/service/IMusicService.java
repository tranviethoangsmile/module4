package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;
import java.util.Optional;

public interface IMusicService {
    List<Music> findAll();

    void save(Music product);

    Optional<Music> findById(int id);

    void update(int id, Music product);

    void remove(int id);
}
