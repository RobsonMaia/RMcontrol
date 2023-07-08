package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Caixa {
	private List<Pedido> vendas;
	private List<ContaAssinada> contasAssinadas;

	public Caixa() {
		this.vendas = new ArrayList<>();
		this.contasAssinadas = new ArrayList<>();
	}

	public void fecharCaixa() {
		System.out.println("=== Fechamento de Caixa ===");
		System.out.println("Faturamento do Dia: " + calcularFaturamentoDia());
		System.out.println("Faturamento da Semana: " + calcularFaturamentoSemana());
		System.out.println("Faturamento do Mês: " + calcularFaturamentoMes());
		System.out.println("Faturamento do Ano: " + calcularFaturamentoAno());
		System.out.println("==========================");
	}

	public double calcularFaturamentoDia() {
		double faturamentoDia = 0.0;
		LocalDate hoje = LocalDate.now();
		for (Pedido venda : vendas) {
			LocalDateTime dataVenda = venda.getDataHora();
			LocalDate dataVendaDate = dataVenda.toLocalDate();
			if (dataVendaDate.equals(hoje)) {
				faturamentoDia += venda.getValorTotal();
			}
		}
		return faturamentoDia;
	}

	public double calcularFaturamentoSemana() {
		double faturamentoSemana = 0.0;
		LocalDate hoje = LocalDate.now();
		LocalDate inicioSemana = hoje.minusDays(hoje.getDayOfWeek().getValue() - 1);
		LocalDate fimSemana = inicioSemana.plusDays(6);
		for (Pedido venda : vendas) {
			LocalDateTime dataVenda = venda.getDataHora();
			LocalDate dataVendaDate = dataVenda.toLocalDate();
			if (!dataVendaDate.isBefore(inicioSemana) && !dataVendaDate.isAfter(fimSemana)) {
				faturamentoSemana += venda.getValorTotal();
			}
		}
		return faturamentoSemana;
	}

	public double calcularFaturamentoMes() {
		double faturamentoMes = 0.0;
		LocalDate hoje = LocalDate.now();
		int mesAtual = hoje.getMonthValue();
		int anoAtual = hoje.getYear();
		for (Pedido venda : vendas) {
			LocalDateTime dataVenda = venda.getDataHora();
			LocalDate dataVendaDate = dataVenda.toLocalDate();
			int mesVenda = dataVendaDate.getMonthValue();
			int anoVenda = dataVendaDate.getYear();
			if (mesVenda == mesAtual && anoVenda == anoAtual) {
				faturamentoMes += venda.getValorTotal();
			}
		}
		return faturamentoMes;
	}

	public double calcularFaturamentoAno() {
		double faturamentoAno = 0.0;
		LocalDate hoje = LocalDate.now();
		int anoAtual = hoje.getYear();
		for (Pedido venda : vendas) {
			LocalDateTime dataVenda = venda.getDataHora();
			LocalDate dataVendaDate = dataVenda.toLocalDate();
			int anoVenda = dataVendaDate.getYear();
			if (anoVenda == anoAtual) {
				faturamentoAno += venda.getValorTotal();
			}
		}
		return faturamentoAno;
	}

	public void gerarRelatorioVendas() {
		System.out.println("=== Relatório de Vendas ===");
		System.out.println("Total de Vendas: " + vendas.size());
		System.out.println("Faturamento Total: " + calcularFaturamentoAno());
		System.out.println("Vendas por Categoria:");
		// Calcular e exibir as vendas por categoria
		// Exemplo: Bebidas: 10 vendas, Alimentos: 5 vendas, etc.
		System.out.println("==========================");
	}

	public List<Pedido> getVendas() {
		return vendas;
	}

	public void setVendas(List<Pedido> vendas) {
		this.vendas = vendas;
	}

	public List<ContaAssinada> getContasAssinadas() {
		return contasAssinadas;
	}

	public void adicionarContaAssinada(ContaAssinada contaAssinada) {
		contasAssinadas.add(contaAssinada);
	}

	public void removerContaAssinada(ContaAssinada contaAssinada) {
		contasAssinadas.remove(contaAssinada);
	}
}
