package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ProductM;

public class ProgramProducts {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<ProductM> listProducts = new ArrayList<ProductM>();

		System.out.println("quantos produtos quer cadastrar?");
		Integer numprodutos = scanner.nextInt();
		
		for(int i = 0; i <= numprodutos ; i++) {
			System.out.println("o produto é do tipo comum/importado/usado ?");
			String tipoProduto = scanner.nextLine();
			
			System.out.println("qual é o nome?");
			String name = scanner.nextLine();
			
			System.out.println("qual é o valor do produto?");
			Double price = scanner.nextDouble();
			
			if(tipoProduto.toUpperCase().equals("COMUM")) {
				ProductM produto = new ProductM(name, price);
			}
		}
	}

}
