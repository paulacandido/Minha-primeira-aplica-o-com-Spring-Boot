package com.segundaaplicacao.segundaAplicacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundaAplicacao")
public class ObjetivosAprendizagemController {
	@GetMapping
	public String ObjetivosAprendizagem() {
		return "Aprender Spring";
	}
}
