package application;

import java.util.Scanner;

import entities.Locador;

public class Alugueis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Temos 9 quartos de hotel, gostaria de alugar algum deles? : SIM || NÃO"); // mudar de lugar
		String resposta = scanner.next();
		//Locador[] locadores = new Locador[9];
		Locador locador = new Locador();
		
		if(resposta.equals("SIM")) {
		
		
		do {
				
				System.out.println("qual é o seu nome?");
				String nome = scanner.next();
				
				System.out.println("qual é o seu email?");
				String email = scanner.next();

				System.out.println("qual é o quarto para alugar?");
				Integer possivelQuarto = scanner.nextInt();
				
				if(locador.getNumeroQuarto(possivelQuarto) == null) {
					locador.AdicionarLocador(email, nome, possivelQuarto);
					
				}else {
					System.out.println("não sera possível este quarto " +
										locador.getNumeroQuarto(possivelQuarto) + "quer tentar outro? SIM || NÃO");
				}
				System.out.println("quer preencher outro quarto?");
				resposta = scanner.next();

			
		} while (resposta.equals("SIM"));
		
		}else {
			System.out.println("tenha um bom dia");
		}
	}

}
