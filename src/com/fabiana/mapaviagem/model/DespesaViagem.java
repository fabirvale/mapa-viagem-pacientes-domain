package com.fabiana.mapaviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fabiana.mapaviagem.enums.TipoUnidadeDespesa;

public class DespesaViagem extends OcorrenciaDuranteViagem{
	
		private TipoUnidadeDespesa unidade;
		private Integer quantidade;
		private String documentoFiscal;
		private int km;
		
		public DespesaViagem(Long id, String descricao, LocalDate data, BigDecimal valor, TipoUnidadeDespesa unidade,
				Integer quantidade, String documentoFiscal, int km) {
			super(id, descricao, data, valor);
			this.unidade = unidade;
			this.quantidade = quantidade;
			this.documentoFiscal = documentoFiscal;
			this.km = km;
		}
		
		
		
		public TipoUnidadeDespesa getUnidade() {
			return unidade;
		}

		public Integer getQuantidade() {
			return quantidade;
		}


		public String getDocumentoFiscal() {
			return documentoFiscal;
		}

		public int getKm() {
			return km;
		}

	
		@Override
		public BigDecimal calcularValor() {

		    if (quantidade != null && super.getValor() != null && quantidade > 0 && super.getValor().compareTo(BigDecimal.ZERO) > 0) {

		        return super.getValor().multiply(BigDecimal.valueOf(quantidade));
		    }

		    return BigDecimal.ZERO;
		}


}
