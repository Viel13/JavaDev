package br.com.fiap.dao;

import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T, K> {

	void create(T entidade);
	void updatate(T entidade);
	T find(K key);
	void delete(K key) throws IdNotFoundException;
	void commit() throws CommitErrorException;
}
