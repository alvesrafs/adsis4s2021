package br.unicesumar.adsis4s2021.meu.cor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cor {
	private String nome;
	private String sigla;
	
	@JsonCreator
	public Cor(@JsonProperty String nome,@JsonProperty String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
}
