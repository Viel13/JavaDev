package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ApartamentoDAO;
import br.com.fiap.dao.impl.ApartamentoDAOImpl;
import br.com.fiap.entity.Apartamento;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
public static void main(String[] args){
	//Cadastrar o apartamento;
	
	Apartamento ap = new Apartamento();
	
	ap.setEndereco("Rua Lins de Vasconcelos, 1445");
	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	
	ApartamentoDAO apDAO = new ApartamentoDAOImpl(em);
	
	apDAO.create(ap);
	
}
}
