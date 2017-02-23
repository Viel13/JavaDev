package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	//Construtor Privado
	private EntityManagerFactorySingleton() {}
	
	//Atributo privado estatico
	private static EntityManagerFactory fabrica;
	
	//metodo public estatico
	public static EntityManagerFactory getInstance(){
		if(fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
}
