package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MusicService implements IMusicService{

    @Autowired
    IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
       return (List<Music>) musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Optional<Music> findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void update(int id, Music music) {

    }

    @Override
    public void remove(int id) {
        musicRepository.deleteById(id);
    }
}
