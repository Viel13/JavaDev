package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.QuartoDAO;
import br.com.fiap.dao.impl.QuartoDAOImpl;
import br.com.fiap.entity.Quarto;
import br.com.fiap.entity.TipoQuarto;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteQuarto {
	public static void main(String[] args) throws CommitErrorException{
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		
		// Cadastrar um quarto
		Quarto qua = new Quarto(0, 12, TipoQuarto.SOLTEIRO, true);
		
		QuartoDAO qDAO = new QuartoDAOImpl(em);
		try{
		qDAO.create(qua);
		qDAO.commit();
		}catch (CommitErrorException e){
			e.printStackTrace();
		}finally{
		em.close();
		
		
		}
		
		
		
	}
}
