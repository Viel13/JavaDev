package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.dao.impl.ItemPedidoImpl;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ConsoleView {
public static void main (String[] args){
	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
	ItemPedidoDAO dao = new ItemPedidoImpl(em);
	
	Produto produto = new Produto("Alho", 2);
	Pedido pedido = new Pedido(Calendar.getInstance(), "Willians");
	
	ItemPedido item = new ItemPedido(produto, pedido, 2);
	
	
	try {
		dao.create(item);
		dao.commit();
	} catch (CommitErrorException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	em.close();
	System.exit(0);
	
}
}
