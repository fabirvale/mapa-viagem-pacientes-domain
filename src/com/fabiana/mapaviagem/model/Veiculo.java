package com.fabiana.mapaviagem.model;

public class Veiculo {
	
	private long  id;
	private String placa;
	private String modelo;
	private int capacidadePassageiros;
	
	public Veiculo(long id, String placa, String modelo, int capacidadePassageiros) {
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

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public void setCapacidadePassageiros(Integer capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	

}
