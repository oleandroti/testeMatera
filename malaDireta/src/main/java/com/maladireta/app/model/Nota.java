package com.maladireta.app.model;

public class Nota {

	private Double valor;
	private String disciplina;
	
	public Nota() {
	}

	public Nota(Double valor, String disciplina) {
		this.valor = valor;
		this.disciplina = disciplina;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
