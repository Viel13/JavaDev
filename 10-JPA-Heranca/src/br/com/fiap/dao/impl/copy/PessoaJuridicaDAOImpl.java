package br.com.fiap.dao.impl.copy;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaJuridicaDAO;
import br.com.fiap.entity.PessoaJuridica;

public class PessoaJuridicaDAOImpl extends GenericDAOImpl<PessoaJuridica, Integer>
																implements PessoaJuridicaDAO	{

	public PessoaJuridicaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
