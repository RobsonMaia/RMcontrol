package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private static int count = 0;
	private int id;
	private List<ItemPedido> itens;
	private Cliente cliente;
	private double valorTotal;
	private LocalDateTime dataHora;

	public Pedido(Cliente cliente) {
		this.id = ++count;
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.dataHora = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public void adicionarItem(Produto produto, int quantidade) {
		ItemPedido itemPedido = new ItemPedido(produto, quantidade);
		itens.add(itemPedido);
		// Atualizar o valor total do pedido
	}

	public void removerItem(Produto produto) {
		ItemPedido itemPedidoRemover = null;
		for (ItemPedido item : itens) {
			if (item.getProduto().equals(produto)) {
				itemPedidoRemover = item;
				break;
			}
		}
		if (itemPedidoRemover != null) {
			itens.remove(itemPedidoRemover);
			// Atualizar o valor total do pedido
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (ItemPedido item : itens) {
			valorTotal += item.getProduto().getPreco() * item.getQuantidade();
		}
		this.valorTotal = valorTotal;
		return valorTotal;
	}

	public void imprimirCupomFiscal() {
		System.out.println("=== Cupom Fiscal ===");
		System.out.println("ID do Pedido: " + id);
		System.out.println("Data e Hora: " + dataHora);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Itens:");
		for (ItemPedido item : itens) {
			System.out.println("- " + item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade()
					+ " - Preço Unitário: " + item.getProduto().getPreco());
		}
		System.out.println("Valor Total: " + valorTotal);
		System.out.println("=====================");
	}

	public void imprimirConta() {
		System.out.println("=== Conta ===");
		System.out.println("ID do Pedido: " + id);
		System.out.println("Data e Hora: " + dataHora);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Itens:");
		for (ItemPedido item : itens) {
			System.out.println("- " + item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade()
					+ " - Subtotal: " + item.getProduto().getPreco() * item.getQuantidade());
		}
		System.out.println("Valor Total: " + valorTotal);
		System.out.println("================");
	}

	public class ItemPedido {
		private Produto produto;
		private int quantidade;

		public ItemPedido(Produto produto, int quantidade) {
			this.produto = produto;
			this.quantidade = quantidade;
		}

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
	}
}
