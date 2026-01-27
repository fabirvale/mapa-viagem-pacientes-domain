package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DespesaViagem extends OcorrenciaDuranteViagem{
	
		private String unidade;
		private Integer quantidade;
		private String documentoFiscal;
		private Integer km;
		
		public DespesaViagem(Long id, String descricao, LocalDate data, BigDecimal valor, String unidade,
				Integer quantidade, String documentoFiscal, Integer km) {
			super(id, descricao, data, valor);
			this.unidade = unidade;
			this.quantidade = quantidade;
			this.documentoFiscal = documentoFiscal;
			this.km = km;
		}
		
		
		
		public String getUnidade() {
			return unidade;
		}



		public void setUnidade(String unidade) {
			this.unidade = unidade;
		}



		public Integer getQuantidade() {
			return quantidade;
		}



		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}



		public String getDocumentoFiscal() {
			return documentoFiscal;
		}



		public void setDocumentoFiscal(String documentoFiscal) {
			this.documentoFiscal = documentoFiscal;
		}



		public Integer getKm() {
			return km;
		}



		public void setKm(Integer km) {
			this.km = km;
		}



		@Override
		public BigDecimal calcularValor() {
			return null;
		}

}
