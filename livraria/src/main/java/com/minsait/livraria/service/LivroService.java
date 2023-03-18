package com.minsait.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minsait.livraria.entity.Livro;
import com.minsait.livraria.repository.LivroRepository;

@Service
public class LivroService {
	
	private LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {		
		this.livroRepository = livroRepository;
	}

	public Livro cadastrarLivro(Livro livro) {
		return this.livroRepository.save(livro);				
	}
	
}
