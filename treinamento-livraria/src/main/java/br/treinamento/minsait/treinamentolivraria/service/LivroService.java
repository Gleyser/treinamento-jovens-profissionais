package br.treinamento.minsait.treinamentolivraria.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.treinamento.minsait.treinamentolivraria.entity.Livro;
import br.treinamento.minsait.treinamentolivraria.repository.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;
		
	@Autowired
	public LivroService(LivroRepository livroRepository) {		
		this.livroRepository = livroRepository;
	}

	public Livro cadastrarLivro(Livro livro) {
		Livro livroRetorno = this.livroRepository.save(livro);
		return livroRetorno;
		
	}

}
