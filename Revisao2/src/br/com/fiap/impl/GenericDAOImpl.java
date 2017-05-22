package br.com.fiap.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

private EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		super();
		this.em = em;
		clazz = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public void cadastrar(T entidade) {
		em.persist(entidade);
		
	}

	@Override
	public void atualizar(T entidade) {
		// TODO Auto-generated method stub
		em.merge(entidade);
	}

	@Override
	public void apagar(K chave) throws IdNotFoundException {
		// TODO Auto-generated method stub
		T entidade = buscar(chave);
		if(entidade==null){
			throw new IdNotFoundException("Não existe essa");
		}em.remove(entidade);
	}

	@Override
	public T buscar(K chave) {
		// TODO Auto-generated method stub
		
		return em.find(clazz, chave);
	}

	@Override
	public void salvar() throws CommitException {
		// TODO Auto-generated method stub
		try{em.getTransaction().begin();
		em.getTransaction().commit();
		}catch (Exception e){
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
			}
		}
	}


