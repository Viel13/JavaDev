package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscarGrupoTeste {
	public static void main(String[] args){
	
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAmDAO gdao = new GrupoAmDAOImpl(em);
		GrupoAm ga = gdao.find(24);
		
		System.out.println(ga.getCodigo());
		System.out.println(ga.getNome());
		System.out.println(ga.getProjeto().getTema());
	
		
	
	}
}
