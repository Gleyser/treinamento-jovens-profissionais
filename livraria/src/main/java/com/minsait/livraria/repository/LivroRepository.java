package com.minsait.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsait.livraria.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
