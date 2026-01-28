package com.fabiana.mapaviagem.model;

import java.time.LocalDate;

public class Pessoa {
	
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String endereco;
	private String telefone;
	
	public Pessoa(Long id, String nome, LocalDate dataNascimento, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int calcularIdade() {
		return 0;
	}
	

}
