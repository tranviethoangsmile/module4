package com.codegym.repository;


import com.codegym.model.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMusicRepository extends CrudRepository<Music,Integer> {


}
