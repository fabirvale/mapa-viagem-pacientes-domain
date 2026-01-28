package com.fabiana.mapaviagem.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
	
	private long id;
	private Paciente paciente;
	private Acompanhante acompanhante;
	private Hospital hospital;
	private Viagem viagem;
	private LocalDate dataAtendimento;
	private LocalTime horarioAtendimento;
	
	public Agendamento(long id, Paciente paciente, Acompanhante acompanhante, Hospital hospital, Viagem viagem,
			LocalDate dataAtendimento, LocalTime horarioAtendimento) {
		this.id = id;
		this.paciente = paciente;
		this.acompanhante = acompanhante;
		validarAcompanhanteObrigatorio(); // garante regra de integridade (obrigatorio ter acompanhante)
		this.hospital = hospital;
		this.viagem = viagem;
		this.dataAtendimento = dataAtendimento;
		this.horarioAtendimento = horarioAtendimento;
	}
	

	public long getId() {
		return id;
	}

	
	public Paciente getPaciente() {
		return paciente;
	}

	
	public Acompanhante getAcompanhante() {
		return acompanhante;
	}


	public Hospital getHospital() {
		return hospital;
	}

	
	public Viagem getViagem() {
		return viagem;
	}

	
	public LocalDate getDataAtendimento() {
		return dataAtendimento;
	}

	
	public LocalTime getHorarioAtendimento() {
		return horarioAtendimento;
	}

	
	private void validarAcompanhanteObrigatorio() {
	    if (acompanhante == null) {
	        throw new IllegalStateException();
	    }
	}

			
	public void reagendar(LocalDate novaData, LocalTime novoHorario) {
		this.dataAtendimento = novaData;
		this.horarioAtendimento = novoHorario;
	}

	
	 public boolean pertenceAViagem() {
		 
		return viagem != null;
	 }
	
}
