package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cerveja;

public class DeleteTeste {
	public static void main(String[] args){
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
	//
	Cerveja cerv =	em.find(Cerveja.class, 1);
	em.remove(cerv);
	
	em.getTransaction().begin();
	em.getTransaction().commit();
	System.out.println("Registro apagado");
	em.close();
	}
}
