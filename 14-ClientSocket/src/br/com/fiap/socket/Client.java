package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Carro;

public class Client {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1",123);
		ObjectOutputStream objectStream = 
				new ObjectOutputStream(socket.getOutputStream());
		Carro carro = new Carro("AAA-1111","Branco");
		
		objectStream.writeObject(carro);
		System.out.println("Carro serializado!");
		objectStream.close();
		socket.close();
	}
	
}
