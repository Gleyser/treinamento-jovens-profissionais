package br.treinamento.minsait.treinamentolivraria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.treinamento.minsait.treinamentolivraria.entity.Livro;
import br.treinamento.minsait.treinamentolivraria.service.LivroService;

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
    public Livro cadastrarLivro(@Valid @RequestBody Livro livro) {
		return this.livroService.cadastrarLivro(livro);
	}
	

}
