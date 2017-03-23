package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Disciplina;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastrarTudo {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		// instanciando projeto
		ProjetoAmDAO pdao = new ProjetoAmDAOImpl(em);
		
		GrupoAm a = new GrupoAm(0, "Vitao", null);
		
		a.addAluno(new Aluno("wILLIAN"));
		a.addAluno(new Aluno("Jackson"));
		a.addAluno(new Aluno("Fas"));
		a.addAluno(new Aluno("tudo"));
		a.addAluno(new Aluno("Vai"));
		List<Disciplina> disc = new ArrayList<>();
		
		disc.add(new Disciplina("Artes", 25));
		disc.add(new Disciplina("TI", 70));
		disc.add(new Disciplina("SE", 55));
		disc.add(new Disciplina("foder", 33));
		
		for(Aluno aluno : a.getAlunos()){
			aluno.setDiscs(disc);
		}
		ProjetoAm p = new ProjetoAm(0, new GregorianCalendar(2017, Calendar.AUGUST, 18),"TI" ,"Fazer tudo" , 802f, a);
		
		for(Disciplina dis : disc){
			dis.setAlunos(a.getAlunos());
		}
		
		
		try{
		pdao.create(p);
		pdao.commit();
		} catch(CommitErrorException e){
			e.printStackTrace();
		}finally {
		
		em.close();
		System.exit(0);
		}

	}

}
