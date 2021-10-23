package com.codegym.repository;

import com.codegym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository <User, Long> {
}
