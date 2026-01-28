package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
	 private PagamentoDiaria pagamentoDiaria;
	 
	 //listas inicializadas na declaração
	 List<Agendamento> agendamentos = new ArrayList<>();
	 List<OcorrenciaDuranteViagem> ocorrencias = new ArrayList<>();
	 
	 
	
		 
	 public Viagem(Long id, String descricao, String cidadeOrigem, String cidadeDestino, LocalDate dataViagem,
			LocalTime horaPrevista, Integer kmInicial, LocalDate dataRetorno, LocalTime horaChegada, Integer kmFinal,
			Motorista motorista, Veiculo veiculo, List<Agendamento> agendamentos,
			List<OcorrenciaDuranteViagem> ocorrencias, PagamentoDiaria pagamentoDiaria) {
		this.id = id;
		this.descricao = descricao;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.dataViagem = dataViagem;
		this.horaPrevista = horaPrevista;
		this.kmInicial = kmInicial;
		this.dataRetorno = dataRetorno;
		this.horaChegada = horaChegada;
		this.kmFinal = kmFinal;
		this.motorista = motorista;
		this.veiculo = veiculo;
		this.agendamentos = agendamentos;
		this.ocorrencias = ocorrencias;
		this.pagamentoDiaria = pagamentoDiaria;
	 }

	 public Long getId() {
		 return id;
	 }

	 public String getDescricao() {
		 return descricao;
	 }

	 public void setDescricao(String descricao) {
		 this.descricao = descricao;
	 }

	 public String getCidadeOrigem() {
		 return cidadeOrigem;
	 }

	 public void setCidadeOrigem(String cidadeOrigem) {
		 this.cidadeOrigem = cidadeOrigem;
	 }

	 public String getCidadeDestino() {
		 return cidadeDestino;
	 }

	 public void setCidadeDestino(String cidadeDestino) {
		 this.cidadeDestino = cidadeDestino;
	 }

	 public LocalDate getDataViagem() {
		 return dataViagem;
	 }

	
	 public LocalTime getHoraPrevista() {
		 return horaPrevista;
	 }

	
	 public Integer getKmInicial() {
		 return kmInicial;
	 }

	
	 public LocalDate getDataRetorno() {
		 return dataRetorno;
	 }

	
	 public LocalTime getHoraChegada() {
		 return horaChegada;
	 }

	 public Integer getKmFinal() {
		 return kmFinal;
	 }

	
	 public Motorista getMotorista() {
		 return motorista;
	 }

	 public void setMotorista(Motorista motorista) {
		 this.motorista = motorista;
	 }

	 public Veiculo getVeiculo() {
		 return veiculo;
	 }

	 public void setVeiculo(Veiculo veiculo) {
		 this.veiculo = veiculo;
	 }

	 public List<Agendamento> getAgendamentos() {
		 return agendamentos;
	 }

	 public List<OcorrenciaDuranteViagem> getOcorrencias() {
		 return ocorrencias;
	 }

	
	 public PagamentoDiaria getPagamentoDiaria() {
		 return pagamentoDiaria;
	 }

		 
	 public void iniciarViagem() {

		    if (motorista == null) {
		        throw new IllegalStateException();
		    }

		    if (agendamentos == null || agendamentos.isEmpty()) {
		        throw new IllegalStateException();
		    }

		    boolean possuiAgendamentoNaData = false;

		    for (Agendamento agendamento : agendamentos) {
		        if (agendamento.getDataAtendimento().equals(dataViagem)) {
		            possuiAgendamentoNaData = true;
		            break;
		        }
		    }

		    if (!possuiAgendamentoNaData) {
		        throw new IllegalStateException();
		    }

		    // viagem iniciada
		}

	 public void finalizarViagem(int kmFinal, LocalDate dataRetorno, LocalTime horaChegada) {

		    // validações básicas
		    if (dataViagem == null || kmInicial <= 0) {
		        throw new IllegalStateException();
		    }

		    if (kmFinal < kmInicial) {
		        throw new IllegalStateException();
		    }

		    if (dataRetorno.isBefore(dataViagem)) {
		        throw new IllegalStateException();
		    }

		    if (pagamentoDiaria == null) {
		        throw new IllegalStateException();
		    }

		    // mudança de estado
		    this.kmFinal = kmFinal;
		    this.dataRetorno = dataRetorno;
		    this.horaChegada = horaChegada;

		    // regra de negócio derivada
		    pagamentoDiaria.definirTipoDiaria();
		}

	 
	 public Integer calcularKmPercorrido(){
		 if (kmFinal <= 0) {
		        return 0;
		    }
		 return kmFinal - kmInicial;
	 }
	 
     public BigDecimal calcularTotalOcorrencias() {
    	 
    	 BigDecimal totalOcorrencias = BigDecimal.ZERO;
    	 
    	 if (ocorrencias != null) {
    		 
    		 for (OcorrenciaDuranteViagem o :ocorrencias) {
    			
    			 totalOcorrencias = totalOcorrencias.add(o.calcularValor());
    		 }
    		 
    	 }
    	 
    	 return totalOcorrencias;
     }
     
    public BigDecimal calcularTotalDespesas() {
    	
       BigDecimal totalDespesas = BigDecimal.ZERO;
    	 
        if (ocorrencias != null) {
    		 
    		 for (OcorrenciaDuranteViagem o :ocorrencias) {
    			 if (o instanceof DespesaViagem) {
    				 totalDespesas = totalDespesas.add(o.calcularValor());
    			 }
    		 }
    	 }
    	 return totalDespesas;
     }
     
     public BigDecimal calcularTotalMultas() {
    	 
    	 BigDecimal totalMultas = BigDecimal.ZERO;
    	 
         if (ocorrencias != null) {
     		 
     		 for (OcorrenciaDuranteViagem o :ocorrencias) {
     			 if (o instanceof MultaViagem) {
     				totalMultas = totalMultas.add(o.calcularValor());
     			 }
     		 }
     	 }
     	 return totalMultas;
    	 
     }
}
