package com.fabiana.mapaviagem.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Viagem {
	
	 private Long id;
	 private String descricao;
	 private String cidadeOrigem;
	 private String cidadeDestino;
	 private LocalDate dataViagem;
	 private LocalTime horaPrevista;
	 private Integer kmInicial;
	 private LocalDate dataRetorno;
	 private LocalTime horaChegada;
	 private Integer kmFinal;
	 private Motorista motorista;
	 private Veiculo veiculo;
	 private List<Agendamento> agendamento;
	 private List<OcorrenciaDuranteViagem> ocorrencias;
	 private PagamentoDiaria pagamentoDiaria;

}
