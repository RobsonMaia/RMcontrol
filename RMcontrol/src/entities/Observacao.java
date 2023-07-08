package entities;

public class Observacao {

	private Produto produto;
	private String observacao;

	public Observacao(Produto produto, String observacao) {
		this.produto = produto;
		this.observacao = observacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
