package application;

import java.util.Scanner;

import entities.Produtos_privados;


public class Programa_produtosvetorPrivado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("qual é o tamanho do seu vetor?");
		int tamanhoVetor = scanner.nextInt();
		
		Produtos_privados[] Vetorprodutos = new Produtos_privados[tamanhoVetor]; 
		
		
		for(int i = 0; i<tamanhoVetor ; i ++) {
			
			System.out.println("digite um nome");
			String name = scanner.next();
			
			System.out.println("digite um numero");
			Double price = scanner.nextDouble();
			
			Vetorprodutos[i] = new Produtos_privados(name, price) ;
			System.out.println("seu nome: " + Vetorprodutos[i].getName() + " seu preco " + Vetorprodutos[i].getPrice());
		}		
			
		scanner.close();
	}

}
