package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.copy.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteView {
public static void main(String[] args){
	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
	Funcionario func = new Funcionario(0, "Marcos", new GregorianCalendar(2017, Calendar.JULY,30), 12000, 1234, 123456 );
	Dependente dep = new Dependente(0, func, "JOHNES");
	
	DependenteDAO ddao = new DependenteDAOImpl(em);
	
	
	try {
		ddao.create(dep);
		ddao.commit();
	} catch (CommitErrorException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	em.close();
	System.exit(0);
	
}
}
