package entities;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

	private int numero;
	private String apelido;
	private List<Pedido> pedidos;
	private ContaAssinada contaAssinada;

	public Mesa(int numero, String apelido) {
		this.numero = numero;
		this.apelido = apelido;
		this.pedidos = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

	public ContaAssinada getContaAssinada() {
		return contaAssinada;
	}

	public void setContaAssinada(ContaAssinada contaAssinada) {
		this.contaAssinada = contaAssinada;
	}

}