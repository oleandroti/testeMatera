package com.notas.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.notas.app.model.Aluno;
import com.notas.app.model.Nota;

@Service
public class NotasService {
	private List<Aluno> alunos;

	/**
	 * Carrega alunos e notas
	 */
	public NotasService() {
		this.alunos = new ArrayList<>();

		// ---Notas Aluno 1 ---
		Nota nt1 = new Nota(7.5, "Matematica");
		Nota nt2 = new Nota(8.2, "Sistemas");
		Nota nt3 = new Nota(8.0, "Meio Ambiente");

		// --- Aluno 1 ---
		Aluno aluno = new Aluno();
		aluno.setCpf("1020304050");
		aluno.getNotas().add(nt1);
		aluno.getNotas().add(nt2);
		aluno.getNotas().add(nt3);

		// ---Notas Aluno 2 ---
		Nota nt4 = new Nota(3.0, "Matematica");
		Nota nt5 = new Nota(9.1, "Sistemas");
		Nota nt6 = new Nota(8.0, "Meio Ambiente");

		// --- Aluno 2 ---
		Aluno aluno2 = new Aluno();
		aluno2.setCpf("2030405060");
		aluno2.getNotas().add(nt4);
		aluno2.getNotas().add(nt5);
		aluno2.getNotas().add(nt6);

		alunos.add(aluno);
		alunos.add(aluno2);
	}

	/**
	 * @param cpf
	 *            = parametro a ser pesquisado
	 * @return lista de notas do cpf pesquido ou null se nao encontrado nenhuma
	 *         nota
	 * 
	 *         Obs: Considerando que cada aluno tem somente um cpf cadastrado
	 */
	public List<Nota> getNotas(String cpf) {

		for (Aluno aluno : alunos) {
			if (aluno.getCpf().equals(cpf))
				return aluno.getNotas();
		}
		return null;
	}
}
