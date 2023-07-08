package application;

import entities.Caixa;
import entities.Cliente;
import entities.Pedido;
import entities.Produto;

public class Main {
	public static void main(String[] args) {
		// Criar objetos de exemplo
		Produto produto1 = new Produto("Produto 1", 10.0);
		Produto produto2 = new Produto("Produto 2", 20.0);
		Cliente cliente = new Cliente("Cliente 1", "123456789", "Endereço 1", "cliente1@example.com");

		// Criar pedido e adicionar itens
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(produto1, 2);
		pedido.adicionarItem(produto2, 3);

		// Imprimir cupom fiscal do pedido
		pedido.imprimirCupomFiscal();

		// Imprimir conta detalhada do pedido
		pedido.imprimirConta();

		// Fechar caixa e exibir relatório de vendas
		Caixa caixa = new Caixa();
		caixa.getVendas().add(pedido);

		caixa.fecharCaixa();
		caixa.gerarRelatorioVendas();
	}
}
