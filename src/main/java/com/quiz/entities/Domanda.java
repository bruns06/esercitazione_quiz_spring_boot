package com.quiz.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "domanda")
public class Domanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String testoDomanda;
	
	private String rispostaEsatta;
	
	private int punteggioDomanda;

	@ManyToMany
	@JoinTable(name = "domanda_test")
	private List<Test> test;
	
	public String getTestoDomanda() {
		return testoDomanda;
	}

	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}

	public int getPunteggioDomanda() {
		return punteggioDomanda;
	}

	public void setPunteggioDomanda(int punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}

	public int getIdDomanda() {
		return id;
	}
	
	
	
}
