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

	public void setId(Long id) {
		this.id = id;
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

	public Integer getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(Integer capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	

}
