package br.com.flproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flproject.entidades.Frase;

@RestController
public class FraseController {
	
	@GetMapping("/frases")//GET POST PUT DELETE
	public List<Frase> lista() {
		Frase frase = new Frase("c", "Primeira Frase");
		Frase frase2 = new Frase("d", "Segunda Frase");
		return Arrays.asList(frase, frase2);
	}

	

}
