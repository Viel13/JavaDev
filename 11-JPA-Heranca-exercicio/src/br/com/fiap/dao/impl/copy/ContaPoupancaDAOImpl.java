package br.com.fiap.dao.impl.copy;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaPoupancaDAO;
import br.com.fiap.entity.ContaPK;
import br.com.fiap.entity.ContaPoupanca;

public class ContaPoupancaDAOImpl extends GenericDAOImpl<ContaPoupanca, ContaPK>
									implements ContaPoupancaDAO{

	public ContaPoupancaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}
