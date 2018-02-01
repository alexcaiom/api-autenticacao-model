package br.com.massuda.alexander.autenticacao.orm.modelo.usuario.profissional;

import br.com.massuda.alexander.persistencia.jdbc.model.EntidadeModelo;

public class Cargo extends EntidadeModelo {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
