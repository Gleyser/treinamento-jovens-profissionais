package br.treinamento.minsait.treinamentolivraria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;

@Entity
public class Livro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String titulo;
	private int ano;
	private int quantidade;
	
	public Livro(String titulo, int ano, int quantidade) {
		
		this.titulo = titulo;
		this.ano = ano;
		this.quantidade = quantidade;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTituto(String tituto) {
		this.titulo = tituto;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	

}
