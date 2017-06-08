package com.notas.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.notas.app.model.Nota;
import com.notas.app.service.NotasService;

@RestController
public class NotasController {

	private final NotasService notasService;

	public NotasController(NotasService notasService) {
		this.notasService = notasService;
	}

	@GetMapping(value = "/alunos/{cpf}/notas")
	public ResponseEntity<List<Nota>> getNotas(@PathVariable String cpf) {
		return ResponseEntity.ok(notasService.getNotas(cpf));
	}
}
