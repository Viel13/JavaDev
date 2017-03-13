package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGrupoProjetoView {

	public static void main(String[] args) {
		//Cadastrar um grupo e um projeto relacionados
		//Obter uma instancia do EntityManager
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
				//Instanciar os DAOs
		GrupoAmDAO gam = new GrupoAmDAOImpl(em);
		ProjetoAmDAO pam = new ProjetoAmDAOImpl(em);
		//Instanciar um grupo e um projeto
		GrupoAm Grupo = new GrupoAm(0, "Maldição do samba");
				ProjetoAm Projeto = new ProjetoAm(0, new GregorianCalendar(2017, Calendar.APRIL, 27), "Java zika", "esse é dificil ein", 10, Grupo);
		//Utilizar o DAO para cadastrar
		//gam.create(Grupo);
		pam.create(Projeto);
		//Commit
		try {
			gam.commit();
		} catch (CommitErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			em.close();
			fabrica.close();
			System.exit(0);
		}
		//Sucesso!
	}
	
}