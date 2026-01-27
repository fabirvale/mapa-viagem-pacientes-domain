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

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public abstract BigDecimal calcularValor();

}
