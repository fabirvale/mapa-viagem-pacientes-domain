package com.fabiana.mapaviagem.model;

import com.fabiana.mapaviagem.enums.TipoEstabelecimento;

public class Hospital {
	
	private Long id;
	private String nome;
	private String cidade;
	private TipoEstabelecimento tipo;
	
	public Hospital(Long id, String nome, String cidade, TipoEstabelecimento tipo) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.tipo = tipo;
	}
	
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public TipoEstabelecimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEstabelecimento tipo) {
		this.tipo = tipo;
	}

	

}
