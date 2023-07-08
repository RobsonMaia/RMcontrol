package entities;

import java.time.LocalDate;

public class ContaAssinada {
	  
	   private Cliente cliente;
	   private double valor;
	   private LocalDate dataVencimento;

	   public ContaAssinada(Cliente cliente, double valor, LocalDate dataVencimento) {
	      this.cliente = cliente;
	      this.valor = valor;
	      this.dataVencimento = dataVencimento;
	   }

	   public Cliente getCliente() {
	      return cliente;
	   }

	   public void setCliente(Cliente cliente) {
	      this.cliente = cliente;
	   }

	   public double getValor() {
	      return valor;
	   }

	   public void setValor(double valor) {
	      this.valor = valor;
	   }

	   public LocalDate getDataVencimento() {
	      return dataVencimento;
	   }

	   public void setDataVencimento(LocalDate dataVencimento) {
	      this.dataVencimento = dataVencimento;
	   }
	}



