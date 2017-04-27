package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaFisicaDAO;
import br.com.fiap.dao.PessoaJuridicaDAO;
import br.com.fiap.dao.impl.copy.PessoaFisicaDAOImpl;
import br.com.fiap.dao.impl.copy.PessoaJuridicaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteSingleTable {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
			PessoaFisica pessoaf = new PessoaFisica("Willian Marks", "crazylike@hotmail.com", "2134456675", Sexo.MASCULINO);
			PessoaJuridica pj = new PessoaJuridica("BuffaloSoldier", "http@tsss.com", "56655454", "JastaPowerBlue");
			
			PessoaFisicaDAO pfdao = new PessoaFisicaDAOImpl(em);
			PessoaJuridicaDAO pjdao = new PessoaJuridicaDAOImpl(em);
			
			
			try {
				pfdao.create(pessoaf);
				pjdao.create(pj);
				pfdao.commit();
			} catch (CommitErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
