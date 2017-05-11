package br.com.fiap.view;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Carro;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		FileInputStream fileStream = 
				new FileInputStream("teste.txt");
		
		ObjectInputStream objectStream = 
				new ObjectInputStream(fileStream);
		
		Carro carro = (Carro) objectStream.readObject();
		
		System.out.println(carro.getPlaca());
		System.out.println(carro.getCor());
		
		objectStream.close();
		fileStream.close();
	}
	
}
