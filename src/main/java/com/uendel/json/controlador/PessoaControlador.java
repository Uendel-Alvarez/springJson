package com.uendel.json.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uendel.json.modelo.Pessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaControlador {

	@GetMapping
	public Pessoa pessoa() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(47);
		pessoa.setNome("Uendel Alvarez da Silva");
		pessoa.setAltura(1.75);
		pessoa.setEstadoCivil("solteiro convicto");
		
		return pessoa;
		
	}
}
