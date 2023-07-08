package entities;

public class Produto {
	private String nome;
	private String fornecedor;
	private String codigoIdentificacao;
	private int quantidade;
	private double preco;

	public Produto(String nome, double preco, int quantidade, String codigoIdentificacao, String fornecedor) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigoIdentificacao = codigoIdentificacao;
		this.fornecedor = fornecedor;
	}

	public Produto(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

}
