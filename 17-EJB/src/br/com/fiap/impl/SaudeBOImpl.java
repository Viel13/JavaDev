package br.com.fiap.impl;

import javax.ejb.Stateless;

import br.com.fiap.bo.SaudeBO;

@Stateless
public class SaudeBOImpl implements SaudeBO{

		
	@Override
	public double calcularImc(float peso, float altura) {
		// TODO Auto-generated method stub
		return peso / (altura*altura);
	}

}
