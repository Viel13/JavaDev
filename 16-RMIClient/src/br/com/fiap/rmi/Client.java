package br.com.fiap.rmi;

import java.rmi.Naming;

import br.com.fiap.service.CotacaoService;

public class Client {

	public static void main(String[] args) throws Exception {
		CotacaoService service = (CotacaoService) 
			Naming.lookup("rmi://127.0.0.1:1234/universo");
		
		double real = service.converterLibraReal(1000);
		
		System.out.println(real);
		
	}
	
}
