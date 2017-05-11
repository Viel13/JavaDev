package br.com.fiap.view;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Carro;

public class Serializacao {

	public static void main(String[] args) throws Exception {
		FileOutputStream fileStream = 
				new FileOutputStream("teste.txt");
		
		ObjectOutputStream objectStream = 
				new ObjectOutputStream(fileStream);
		
		Carro carro = new Carro("ADC-1233","Preto");
		
		objectStream.writeObject(carro);
		
		System.out.println("Carro serializado!");
		
		objectStream.close();
		fileStream.close();
	}
	
}
