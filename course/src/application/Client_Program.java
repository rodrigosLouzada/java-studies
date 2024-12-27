package application;

import java.util.Scanner;

import entities.ClientBank;

public class Client_Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ClientBank novoClienteBank = new ClientBank();
		Double saldo = 0.0;
		Double valordeposito ,valorSaque = 0.0;
		
		System.out.println("gostaria de realizar um cadastro: Sim || Não ?");
		
		String resposta = scan.next();
		
		if(resposta.equals("Sim")){
			
			System.out.println("qual é o seu nome?");
			String clienteNome = scan.next();
			
			
			System.out.println("qual é o número de sua conta?");
			Integer contaNumero = scan.nextInt();
			
			System.out.println("quer realizar um primeiro deposito? Adicone qualquer valor");
			saldo = scan.nextDouble();
			
			novoClienteBank.cadastroConta(contaNumero, clienteNome, saldo);
			
			novoClienteBank.mostrarDadosCliente();
			
		}else {
			System.out.println("Para usar o nosso sistema, é necessário um cadastro, tente novamente");
			return;
		}
			
			
		
		do {
			System.out.println("qual opção quer realizar? : Deposito || Saque");
			 resposta = scan.next();
			 
			 if(resposta.equals("Deposito")) {
				 System.out.println("de qual valor seria?");
				 valordeposito = scan.nextDouble();
				 novoClienteBank.deposito(valordeposito);
				 
				 
				 
				 
			 }else if (resposta.equals("Saque")) {
				 
				System.out.println("de quanto é o valor do saque");
				valorSaque = scan.nextDouble();
				
				novoClienteBank.saque(valorSaque);
				
				
			}
			 	
			 
			 	System.out.println("quer continuar com as opcóes bancarias : Sim || Não");
				
				resposta = scan.next();
			
		} while (resposta.equals("Sim"));
			
		System.out.println("obrigado, volte sempre!");
	}

}
