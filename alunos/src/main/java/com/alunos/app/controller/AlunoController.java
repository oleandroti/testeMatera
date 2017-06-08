package com.alunos.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alunos.app.model.Aluno;
import com.alunos.app.service.AlunoService;

@RestController
public class AlunoController {

	private final AlunoService alunoService;

	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	@GetMapping(value = "/alunos")
	public ResponseEntity<List<Aluno>> getAlunos() {
		return ResponseEntity.ok(alunoService.getAlunos());
	}
}
