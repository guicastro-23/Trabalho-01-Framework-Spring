package com.projeto.futebol.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_jogador;
	private String nome;
	private String email;
	private String datanasc;
	
	public Jogador() {
		
	}

	public Integer getCod_jogador() {
		return cod_jogador;
	}

	public void setCod_jogador(Integer cod_jogador) {
		this.cod_jogador = cod_jogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}

	


	

	

	
}
