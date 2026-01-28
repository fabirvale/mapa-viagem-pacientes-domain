package com.fabiana.mapaviagem.model;

import java.time.Duration;
import java.time.LocalDateTime;

import com.fabiana.mapaviagem.enums.TipoDiaria;

public class PagamentoDiaria {

	private long id;
	private TipoDiaria tipoDiaria;
	private LocalDateTime dataHoraSaida;
	private LocalDateTime dataHoraAlmoco;
	private LocalDateTime dataHoraRetorno;

	public PagamentoDiaria(long id, TipoDiaria tipoDiaria, LocalDateTime dataHoraSaida,
			LocalDateTime dataHoraAlmoco, LocalDateTime dataHoraRetorno) {
		this.id = id;
		this.tipoDiaria = tipoDiaria;
		this.dataHoraSaida = dataHoraSaida;
		this.dataHoraAlmoco = dataHoraAlmoco;
		this.dataHoraRetorno = dataHoraRetorno;
	}

	public long getId() {
		return id;
	}

	public TipoDiaria getTipoDiaria() {
		return tipoDiaria;
	}


	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}

	public LocalDateTime getDataHoraAlmoco() {
		return dataHoraAlmoco;
	}

	public LocalDateTime getDataHoraRetorno() {
		return dataHoraRetorno;
	}

	public Duration calcularDuracaoViagem() {
		return Duration.between(dataHoraSaida, dataHoraRetorno);
	}
	
	public boolean possuiPernoite() {
	    return dataHoraRetorno.toLocalDate().isAfter(dataHoraSaida.toLocalDate());
	}

	public void definirTipoDiaria() {
	    long horas = calcularDuracaoViagem().toHours();

	    if (possuiPernoite()) {
	        this.tipoDiaria = TipoDiaria.COMPLETA_COM_PERNOITE;
	    } else {
	        for (TipoDiaria td : TipoDiaria.values()) {
	            if (td.aplicaPara((int) horas)) {
	                this.tipoDiaria = td;
	                break;
	            }
	        }
	    }
	}

}
