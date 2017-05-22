package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitException;
import br.com.fiap.impl.EditoraDAOImpl;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class testeView {
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		Autor a = new Autor("Willians", new GregorianCalendar(1980, Calendar.APRIL,21));
		List<Autor> lista = new ArrayList<>();
		lista.add(a);
		Livro l1 = new Livro(0, "Louco o cara", null, lista);
		Editora e = new Editora("Editora Jognsons");
		e.addLivro(l1);
		
		for(Livro l: e.getLivros()){
			l.setEditora(e);
		}
		
		EditoraDAO edao = new EditoraDAOImpl(em);
		
		
		try {
			edao.cadastrar(e);
			edao.salvar();
		} catch (CommitException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally{
			em.close();
			System.exit(0);
		}
		
		
		
		
		
	}

}
