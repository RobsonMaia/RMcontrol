package entities;

public class Usuario {
	private String nome;
	private String senha;
	private NivelAcesso nivelAcesso;

	public Usuario(String nome, String senha, NivelAcesso nivelAcesso) {
		this.nome = nome;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

}
