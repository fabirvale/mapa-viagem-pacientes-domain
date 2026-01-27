package com.fabiana.mapaviagem.model;

import java.time.LocalTime;

public class Agendamento {
	
	private Long id;
	private LocalTime horario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Agendamento(Long id, LocalTime horario) {
		this.id = id;
		this.horario = horario;
	}

	
}
