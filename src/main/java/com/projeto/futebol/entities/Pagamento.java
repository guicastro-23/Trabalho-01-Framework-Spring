package com.projeto.futebol.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_pagamento;
	private Short ano;
	private Byte mes;
	private java.math.BigDecimal valor;
	
	
	@ManyToOne
	@JoinColumn(name = "cod_jogador")
	private Jogador jogador; 
	
	public Pagamento() {
		
	}

	public Integer getCod_pagamento() {
		return cod_pagamento;
	}

	public void setCod_pagamento(Integer cod_pagamento) {
		this.cod_pagamento = cod_pagamento;
	}

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

	public Byte getMes() {
		return mes;
	}

	public void setMes(Byte mes) {
		this.mes = mes;
	}

	public java.math.BigDecimal getValor() {
		return valor;
	}

	public void setValor(java.math.BigDecimal valor) {
		this.valor = valor;
	}

	

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	

	

	
}
