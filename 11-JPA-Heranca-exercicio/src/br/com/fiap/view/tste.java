package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaCorrenteDAO;
import br.com.fiap.dao.ContaPoupancaDAO;
import br.com.fiap.dao.impl.copy.ContaCorrenteDAOImpl;
import br.com.fiap.dao.impl.copy.ContaPoupancaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class tste {
	public static void main(String[] args){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		Agencia a = new Agencia("Rua Alfredo Feijor, 66");
		
		ContaCorrente cc = new ContaCorrente(a, 5000, 0.12, 6000);
		ContaPoupanca cp = new ContaPoupanca(a, 12000, 12);
		 
		ContaCorrenteDAO ccdao = new ContaCorrenteDAOImpl(em);
		ContaPoupancaDAO cpdao = new ContaPoupancaDAOImpl(em);
		
		
		try {
			ccdao.create(cc);
			cpdao.create(cp);
			ccdao.commit();
		} catch (CommitErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		
	}
}
