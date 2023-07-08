package entities;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoque {

	private List<Produto> estoque;

	public ControleEstoque() {
		this.estoque = new ArrayList<>();
	}

	public List<Produto> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Produto> estoque) {
		this.estoque = estoque;
	}

	public void adicionarProduto(Produto produto) {

	}

	public void removerProduto(Produto produto) {

	}

}
