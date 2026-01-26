package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract  class OcorrenciaDuranteViagem {
	
	private Long id;
	private String descricao;
	private LocalDate data;
	private BigDecimal valor;

}
