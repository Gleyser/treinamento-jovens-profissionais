package br.treinamento.minsait.treinamentolivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.treinamento.minsait.treinamentolivraria.entity.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long> {

}
