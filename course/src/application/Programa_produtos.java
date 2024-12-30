package application;

import java.util.Scanner;

import entities.Produtos;

public class Programa_produtos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("qual é o tamanho do seu vetor?");
		int tamanhoVetor = scanner.nextInt();
		
		Produtos[] Vetorprodutos = new Produtos[tamanhoVetor]; 
		
		
		for(int i = 0; i<tamanhoVetor ; i ++) {
			
			System.out.println("digite um nome");
			String name = scanner.next();
			
			System.out.println("digite um numero");
			double price = scanner.nextDouble();
			
			Vetorprodutos[i] = new Produtos(name, price) ;
			System.out.println("seu nome: " + Vetorprodutos[i].name + " seu preco " + Vetorprodutos[i].price);
		}		
			
		scanner.close();
	}

}
