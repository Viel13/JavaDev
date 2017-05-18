package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface SaudeBO {

	double calcularImc(float peso, float altura);
	
}