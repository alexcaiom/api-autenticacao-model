package br.com.massuda.alexander.autenticacao.orm.modelo.sistema;
import br.com.massuda.alexander.persistencia.jdbc.anotacoes.Tabela;
import br.com.massuda.alexander.persistencia.jdbc.model.EntidadeModelo;

@Tabela(nome="tbl_sistema")
public class Sistema extends EntidadeModelo{

	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Sistema [id=" + id + ", nome=" + nome + "]";
	}
	
}