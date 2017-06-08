package com.maladireta.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maladireta.app.model.Aluno;
import com.maladireta.app.model.Email;
import com.maladireta.app.model.MalaDireta;
import com.maladireta.app.model.Nota;

@Service
public class MalaDiretaService {

	/**
	 * Metodo responsavel por pegar alunos eleitos para envio da Mala Direta
	 * 
	 * @return
	 */
	private final List<Aluno> getAlunosToMalaDireta() {
		List<Aluno> alunos = null;

		try {
			// --- Acessa Servico de Alunos ---
			ResponseEntity<List<Aluno>> responseAlunos = new RestTemplate().exchange("http://localhost:8090/alunos",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Aluno>>() {
					});

			alunos = responseAlunos.getBody();

			for (int i = 0; i < alunos.size(); i++) {
				// --- Acesso Servico de Notas do Aluno ---
				ResponseEntity<List<Nota>> responseNotas = new RestTemplate().exchange(
						"http://localhost:8091/alunos/" + alunos.get(i).getDocumento() + "/notas", HttpMethod.GET, null,
						new ParameterizedTypeReference<List<Nota>>() {
						});

				List<Nota> notas = responseNotas.getBody();

				for (Nota nota : notas) {
					// --- Verifica se o Aluno tem nota inferior a 7 para
					// elege-lo a Mala Direta ---
					if (nota.getValor() <= 7.0) {
						alunos.get(i).setNotas(notas);
						break;
					}
				}
				alunos.remove(i);
			}

		} catch (Exception e) {
			return null;
		}
		return alunos;
	}

	/**
	 * Metodo responsavel por enviar os emails e retornar uma lista dos emails
	 * Enviados
	 * 
	 * @return MalaDireta
	 */
	public MalaDireta enviarMalaDireta() {
		List<Aluno> alunos = getAlunosToMalaDireta();
		List<Email> emails = new ArrayList<>();
		MalaDireta malaDireta = new MalaDireta();

		if (alunos != null && alunos.size() > 0) {
			for (Aluno aluno : alunos) {
				Email email = new Email();
				email.setCep(aluno.getCep());
				email.setEndereco(aluno.getEndereco());
				email.setNome(aluno.getNome());
				email.setMensagem(
						"Informamos que foram encontradas notas abaixo do minimo necessário para aprovação, procure a secretaria para mais informações!");
				emails.add(email);
			}

			malaDireta.setQuantidadeEmailsEnviados(alunos.size());
			malaDireta.setEmails(emails);
		}
		return malaDireta;
	}
}
