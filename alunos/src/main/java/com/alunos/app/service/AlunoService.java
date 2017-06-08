package com.alunos.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alunos.app.model.Aluno;

@Service
public class AlunoService {
	
	private final List<Aluno> alunos;
	
	/**
	 * Carrega alunos
	 */
	public AlunoService() {
		//--- Instancia Aluno 1 ---
		Aluno aluno1 = new Aluno();
		aluno1.setDocumento("1020304050");
		aluno1.setNome("Leandro Aparecido Araujo");
		aluno1.setEndereco("Rua Bento da Silva Leite, 764 Jardim Chapadão Campinas/SP");
		aluno1.setCep("13070064");
		
		//--- Instancia Aluno 2 ---
		Aluno aluno2 = new Aluno();
		aluno2.setDocumento("2030405060");
		aluno2.setNome("Myrian Cristhina");
		aluno2.setEndereco("Rua Andradina, 25 Remanso Hortolandia/SP");
		aluno2.setCep("13504565");
		
		alunos = new ArrayList<>();
		alunos.add(aluno1);
		alunos.add(aluno2);
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}

}
