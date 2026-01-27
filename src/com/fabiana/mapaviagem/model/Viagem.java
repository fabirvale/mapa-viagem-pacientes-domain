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

	 public void setId(Long id) {
		 this.id = id;
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

	 public void setDataViagem(LocalDate dataViagem) {
		 this.dataViagem = dataViagem;
	 }

	 public LocalTime getHoraPrevista() {
		 return horaPrevista;
	 }

	 public void setHoraPrevista(LocalTime horaPrevista) {
		 this.horaPrevista = horaPrevista;
	 }

	 public Integer getKmInicial() {
		 return kmInicial;
	 }

	 public void setKmInicial(Integer kmInicial) {
		 this.kmInicial = kmInicial;
	 }

	 public LocalDate getDataRetorno() {
		 return dataRetorno;
	 }

	 public void setDataRetorno(LocalDate dataRetorno) {
		 this.dataRetorno = dataRetorno;
	 }

	 public LocalTime getHoraChegada() {
		 return horaChegada;
	 }

	 public void setHoraChegada(LocalTime horaChegada) {
		 this.horaChegada = horaChegada;
	 }

	 public Integer getKmFinal() {
		 return kmFinal;
	 }

	 public void setKmFinal(Integer kmFinal) {
		 this.kmFinal = kmFinal;
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

	 public List<Agendamento> getAgendamento() {
		 return agendamentos;
	 }

	 public void setAgendamento(List<Agendamento> agendamentos) {
		 this.agendamentos = agendamentos;
	 }

	 public List<OcorrenciaDuranteViagem> getOcorrencias() {
		 return ocorrencias;
	 }

	 public void setOcorrencias(List<OcorrenciaDuranteViagem> ocorrencias) {
		 this.ocorrencias = ocorrencias;
	 }

	 public PagamentoDiaria getPagamentoDiaria() {
		 return pagamentoDiaria;
	 }

	 public void setPagamentoDiaria(PagamentoDiaria pagamentoDiaria) {
		 this.pagamentoDiaria = pagamentoDiaria;
	 }
	 
	 public void iniciarViagem(){
		 
	 }
	 
	 public void finalizarViagem(Integer kmFinal){
		 
	 }
	 
	 public Integer calcularKmPercorrido(){
		 return null;
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
