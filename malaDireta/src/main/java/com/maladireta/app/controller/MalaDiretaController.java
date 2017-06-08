package com.maladireta.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maladireta.app.model.MalaDireta;
import com.maladireta.app.service.MalaDiretaService;

@RestController
public class MalaDiretaController {

	private final MalaDiretaService malaDiretaService;

	public MalaDiretaController(MalaDiretaService malaDiretaService) {
		this.malaDiretaService = malaDiretaService;
	}

	@PostMapping(value = "/malaDireta", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public MalaDireta enviarMalaDireta() {
		MalaDireta malaDireta = malaDiretaService.enviarMalaDireta();
		return malaDireta;
	}

}
