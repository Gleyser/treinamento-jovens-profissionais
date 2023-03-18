package com.minsait.livraria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.livraria.entity.Livro;
import com.minsait.livraria.service.LivroService;

@RestController
@RequestMapping("/api/v1/livraria/livros")
public class LivroController {
	
	private LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {		
		this.livroService = livroService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Livro cadastraLivro(@Valid @RequestBody Livro livro) {
		return this.livroService.cadastrarLivro(livro);
		
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Gleyser";
	}
		
}
