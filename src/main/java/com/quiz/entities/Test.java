package com.quiz.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titoloTest;
	
	@ManyToOne
	private Persona persona;
	
	@ManyToMany
	@JoinTable(name = "domanda_test")
	private List<Domanda> domanda;
	
	@SuppressWarnings("unused")
	private LocalDate dataTest = LocalDate.now();

	public String getTitoloTest() {
		return titoloTest;
	}

	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}

	public int getIdTest() {
		return id;
	} 
	
	
	
}
