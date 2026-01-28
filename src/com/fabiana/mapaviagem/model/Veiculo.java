package com.fabiana.mapaviagem.model;

public class Veiculo {
	
	private Long  id;
	private String placa;
	private String modelo;
	private Integer capacidadePassageiros;
	
	public Veiculo(Long id, String placa, String modelo, Integer capacidadePassageiros) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public Long getId() {
		return id;
	}

	
	public String getPlaca() {
		return placa;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	
}
