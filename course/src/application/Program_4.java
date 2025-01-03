package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product_2;

public class Program_4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product_2 product = new Product_2(name, price, quantity);
		Product_2 prod = new Product_2(name, price);
		
		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		
		product.addProducts(quantity);

		System.out.println("Updated data: " + product);

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Updated data: " + product);
		sc.close();
	}
}