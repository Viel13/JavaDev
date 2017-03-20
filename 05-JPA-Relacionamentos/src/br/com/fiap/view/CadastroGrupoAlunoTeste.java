package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.AlunoDAOImpl;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGrupoAlunoTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		//instanciar os daos 
		GrupoAmDAO gamDAO = new GrupoAmDAOImpl(em);
		 ProjetoAmDAO pamDAO = new ProjetoAmDAOImpl(em);
		 AlunoDAO aDAO = new AlunoDAOImpl(em);
		 
		 //Intaciar o grupo
		 GrupoAm grupo = new GrupoAm();
		 grupo.setNome("Johnson");
		 grupo.addAluno(new Aluno("Viction"));
		 grupo.addAluno(new Aluno("vai se fude2"));
		 grupo.addAluno(new Aluno("vai se fude3"));
		 grupo.addAluno(new Aluno("vai se fud4"));
		 
		 //cadastrat com commit
		try{
			gamDAO.create(grupo);
			gamDAO.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
		em.close();
		}

	}

}
