package entities;

import java.util.List;

public class NivelAcesso {

	private String nome;
	private List<String> permissoes;

	public NivelAcesso(String nome, List<String> permissoes) {
		this.nome = nome;
		this.permissoes = permissoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<String> permissoes) {
		this.permissoes = permissoes;
	}

}
