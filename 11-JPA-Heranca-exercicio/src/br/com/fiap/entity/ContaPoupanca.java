package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_POUPANCA")
public class ContaPoupanca extends Conta {
	
	@Column(name="VL_RENDIMENTO")
	private double valorRendimento;

	

	public ContaPoupanca(Agencia agencia, double saldo, double valorRendimento) {
		super(agencia, saldo);
		this.valorRendimento = valorRendimento;
	}

	public double getValorRendimento() {
		return valorRendimento;
	}

	public void setValorRendimento(double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}
	
	
}
