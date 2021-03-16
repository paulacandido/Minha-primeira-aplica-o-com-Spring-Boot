package com.primeiraaplicacao.primeiraAplicacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraAplicacao")
public class HabilidadesMentalidadesController {
	@GetMapping
	public String HabilidadesMentalidades () {
		return "Há muitas habilidades e mentalidades que desejo aprender";
	}

}
