package br.com.fiap.dao.impl.copy;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AgenciaDAO;
import br.com.fiap.entity.Agencia;

public class AgenciaDAOImpl extends GenericDAOImpl<Agencia, Integer>
									implements AgenciaDAO{

	public AgenciaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}