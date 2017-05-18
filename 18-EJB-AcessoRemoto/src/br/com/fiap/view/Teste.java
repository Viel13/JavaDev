package br.com.fiap.view;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import br.com.fiap.bo.CarrinhoBO;
import br.com.fiap.bo.SaudeBO;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		prop.put("jboss.naming.client.ejb.context", true); 
		prop.put("remote.connection.default.port", "8080");
		
		final Context context = new InitialContext(prop);
		
		//SaudeBO bo = (SaudeBO) context.lookup("ejb:/17-EJB/SaudeBOImpl!br.com.fiap.bo.SaudeBO");
		
		CarrinhoBO carrinhoBO = 
			(CarrinhoBO) context.lookup("ejb:/17-EJB/CarrinhoBOImpl!br.com.fiap.bo.CarrinhoBO?stateful");
		
		System.out.println(carrinhoBO.adicionarBitcoin(12));
		
		//System.out.println(bo.calcularImc(50, 1.5f));
		
	}
	
}
