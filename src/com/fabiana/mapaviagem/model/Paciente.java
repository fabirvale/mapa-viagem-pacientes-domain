package com.fabiana.mapaviagem.model;

import java.time.LocalDate;

public class Paciente extends Pessoa {
	
	private String cns;

	public Paciente(Long id, String nome, LocalDate dataNascimento, String endereco, String telefone, String cns) {
		super(id, nome, dataNascimento, endereco, telefone);
		this.cns = cns;
	}

	public boolean validarCNS() {
		return false;
	}
	
	

}
