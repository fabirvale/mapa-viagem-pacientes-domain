package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract  class OcorrenciaDuranteViagem {
	
	private Long id;
	private String descricao;
	private LocalDate data;
	private BigDecimal valor;
	
	public OcorrenciaDuranteViagem(Long id, String descricao, LocalDate data, BigDecimal valor) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	
	public String getDescricao() {
		return descricao;
	}

	
	public LocalDate getData() {
		return data;
	}

	
	public BigDecimal getValor() {
		return valor;
	}

	
	public abstract BigDecimal calcularValor();

}
