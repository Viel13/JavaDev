package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.entity.Sexo;

public class TesteCadastro {
	public static void main(String[] args){
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			EntityManager em = fabrica.createEntityManager();
			
			Autor au = new Autor(0, "Jose", Sexo.MASCULINO, "Abreu", new GregorianCalendar(1996, Calendar.JULY, 25));
			Editora ed = new Editora(0, 985452, "Abril", "Rua Abilio Ramos, 122");
			Livro lv = new Livro(545614,"A volta dos que nao foram", 3000, new GregorianCalendar(2001, Calendar.AUGUST, 12), null );
	
	em.persist(lv);
	
	
	
	em.getTransaction().begin();
	em.getTransaction().commit();
	em.close();
	System.out.println("Cadastrado com sucesso");
	
	System.exit(0);
	
	}
}
