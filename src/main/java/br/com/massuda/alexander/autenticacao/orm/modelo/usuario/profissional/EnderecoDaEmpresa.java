package br.com.massuda.alexander.autenticacao.orm.modelo.usuario.profissional;

import br.com.massuda.alexander.autenticacao.orm.modelo.Endereco;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.Usuario;
import br.com.massuda.alexander.persistencia.jdbc.anotacoes.Tabela;
import br.com.massuda.alexander.persistencia.jdbc.model.EntidadeModelo;

@Tabela(nome="tbl_endereco_usuario")
public class EnderecoDaEmpresa extends EntidadeModelo {
	
	private Usuario usuario;
	private Endereco endereco;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
