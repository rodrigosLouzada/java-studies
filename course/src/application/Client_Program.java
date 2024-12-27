package application;

import java.util.Scanner;

import entities.ClientBank;

public class Client_Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ClientBank novoClienteBank = new ClientBank();
		
		System.out.println("gostaria de realizar um cadastro? Sim ou Não?");
		
		String respota = scan.next();
		
		if(respota == "Sim") {
			System.out.println("qual é o seu nome");
		}
		
		
		
		
		
	}

}
