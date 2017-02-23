package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cerveja;

public class UpdateTeste {

	public static void main(String[] args){
		//obter o entityManager
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//find em uma cerveja
		Cerveja cerv = em.find(Cerveja.class, 1);
		
		//alterar um atributo
		cerv.setNome("Bavaria");
		
		//alterar no vbanco de dados
		em.merge(cerv);
		
		//commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Alterada");
		
		
		
	}
}
