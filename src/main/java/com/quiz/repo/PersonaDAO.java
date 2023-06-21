package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entities.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>{

}
