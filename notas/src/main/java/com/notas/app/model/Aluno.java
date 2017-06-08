package com.notas.app.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String cpf;
	private List<Nota> notas;
	
	public Aluno() {
		this.notas = new ArrayList<>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
