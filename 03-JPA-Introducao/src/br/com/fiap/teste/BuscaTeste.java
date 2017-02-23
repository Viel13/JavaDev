package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cerveja;

public class BuscaTeste {
public static void main(String[] args){
	//obter o entityManager
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	//buscar uma cerveja/refri
	Cerveja cerva = em.find(Cerveja.class, 1);
	
	//exibir o nome da cerveja
	System.out.println(cerva.getNome());
	System.exit(0);
}
}
