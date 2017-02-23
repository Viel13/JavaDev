package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cerveja;
import br.com.fiap.entity.Refrigerante;
import br.com.fiap.entity.SaborRefrigerante;
import br.com.fiap.entity.TipoCerveja;

public class CadastroTeste {
public static void main(String[] args){
	//Obter uma instacia da Fabrica
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
			//Obter uma instancia entitymanager
	
	//Instanciar uma cerveja/refrigerante.
	Cerveja cerv = new Cerveja(0, "Krill", 0.05f, 1, Calendar.getInstance(),
	new GregorianCalendar(2020, Calendar.JANUARY,1), TipoCerveja.PILSEN, null, false);
	
	// Intanciar um refri
	Refrigerante refri = new Refrigerante(0, "Tubaina", SaborRefrigerante.COLA, Calendar.getInstance(), 0.05f, null);
	
	//Cadastrar a cerveja e o refri
	em.persist(cerv);
	em.persist(refri);
	
	//Transaçao
	//Inicializa uma transação
	em.getTransaction().begin();
	em.getTransaction().commit();
	em.close();
	
	System.out.println("Cerveja e refrigerante registrado");
	System.exit(0);;

}
}
