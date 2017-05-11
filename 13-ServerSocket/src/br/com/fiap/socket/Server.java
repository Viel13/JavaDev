package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Carro;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(123);
		while (true){
			System.out.println("Aguardando conexão...");
			Socket socket = server.accept();
			
			ObjectInputStream objectStream = 
					new ObjectInputStream(socket.getInputStream());
			try{
				Carro carro = (Carro) objectStream.readObject();
				
				System.out.println(carro.getPlaca());
				System.out.println(carro.getCor());
				System.out.println(socket.getInetAddress().getHostAddress());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//server.close();
	}
	
}
