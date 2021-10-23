package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface ISmartPhoneRepository extends CrudRepository<Smartphone, Long> {
}
