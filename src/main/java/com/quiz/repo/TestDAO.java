package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Test;

public interface TestDAO extends JpaRepository<Test, Integer> {

}
