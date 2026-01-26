package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fabiana.mapaviagem.enums.TipoDiaria;

public class PagamentoDiaria {
	
	private Long id;
	private TipoDiaria tipoDiaria;
	private BigDecimal valor;
	private LocalDateTime dataHoraSaida;
	private LocalDateTime dataHoraAlmoco;
	private LocalDateTime dataHoraRetorno;

}
