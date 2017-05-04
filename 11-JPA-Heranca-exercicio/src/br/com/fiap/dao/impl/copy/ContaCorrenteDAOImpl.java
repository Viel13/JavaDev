package br.com.fiap.dao.impl.copy;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaCorrenteDAO;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPK;

public class ContaCorrenteDAOImpl extends GenericDAOImpl<ContaCorrente, ContaPK>
							implements ContaCorrenteDAO{

	public ContaCorrenteDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}
