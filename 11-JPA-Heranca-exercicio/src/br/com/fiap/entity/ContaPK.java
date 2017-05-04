package br.com.fiap.entity;

import java.io.Serializable;

public class ContaPK implements Serializable{
	
	private int codConta;
	
	private int agencia;

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	

}
