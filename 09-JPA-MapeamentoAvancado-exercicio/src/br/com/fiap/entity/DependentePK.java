package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable{

	private int cod;
	private int funcionario;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	} 
}
