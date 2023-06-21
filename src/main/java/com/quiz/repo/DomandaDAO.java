package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Domanda;

public interface DomandaDAO extends JpaRepository<Domanda, Integer> {

}
