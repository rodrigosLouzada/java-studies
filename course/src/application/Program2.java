package application;

import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("digite um nome para o seu produto");
		String name = scan.next();
		
		System.out.println("digite um preço para o seu produto");
		Double price = scan.nextDouble();
		
		System.out.println("digite a quantidade para o seu produto");
		int quantity = scan.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		//System.out.println(product.name + product.price + product.quantity);
		System.out.println("o produto inteiro é :" + product.toString());
		
		//product.addProducts(quantity);
		//System.out.println(product.totalvalue(price, quantity));
		//product.removeProducts(quantity);
		
		scan.close();
	}

}
