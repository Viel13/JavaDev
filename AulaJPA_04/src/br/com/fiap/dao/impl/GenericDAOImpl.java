package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.IdNotFoundException;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K> {

	private EntityManager em;
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em){
		clazz = (Class<T>) ((ParameterizedType)getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	this.em = em;
	}
	@Override
	public void create(T entidade) {
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(T entidade) {
		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();
		
	}

	@Override
	public T find(K id) {
		// TODO Auto-generated method stub
		return em.find(clazz, id);
	}

	@Override
	public void delete(K id) throws IdNotFoundException {
		T entidade = find(id);
		if(entidade==null){
			throw new IdNotFoundException("eNTIDADE DEU RUIM");
		}
			em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();
	
	}
	

}
