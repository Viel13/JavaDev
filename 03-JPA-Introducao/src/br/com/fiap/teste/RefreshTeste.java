package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cerveja;

public class RefreshTeste {
	public static void main(String[] args){
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
	
		//buscar a serveja
		
		Cerveja cerv = em.find(Cerveja.class, 1);
		
		//exibir o nome
		System.out.println(cerv.getNome());
		
		//mudar o nome
		cerv.setNome("Brahma");
		em.merge(cerv);
		System.out.println(cerv.getNome());
		
		
		// fazer o refresh
		em.refresh(cerv);
		
		//exibir o nome
		
		System.out.println(cerv.getNome());
		em.close();
	}
}
