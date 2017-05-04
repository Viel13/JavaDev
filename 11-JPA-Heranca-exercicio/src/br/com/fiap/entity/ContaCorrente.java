package br.com.fiap.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="TB_CORRENTE")
public class ContaCorrente extends Conta{
	
	@Column(name="VL_TARIFA")
	private double valorTarifa;
	@Column(name="VL_CHEQUE_ESPECIAL")
	private double valorCE;
	
	

	public ContaCorrente(Agencia agencia, double saldo, double valorTarifa, double valorCE) {
		super(agencia, saldo);
		this.valorTarifa = valorTarifa;
		this.valorCE = valorCE;
	}

	public double getValorTarifa() {
		return valorTarifa;
	}

	public void setValorTarifa(double valorTarifa) {
		this.valorTarifa = valorTarifa;
	}

	public double getValorCE() {
		return valorCE;
	}

	public void setValorCE(double valorCE) {
		this.valorCE = valorCE;
	}
	
	
	
	
	
}
