package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductM;
import entities.UsedProduct;

public class ProgramProducts {

	public static void main(String[] args) throws ParseException {

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
				listProducts.add(produto);
				
			}else if(tipoProduto.toUpperCase().equals("IMPORTADO")) {
				
				System.out.println("qual é a taxa extra?");
				Double customsFee = scanner.nextDouble();
				ProductM produto = new ImportedProduct(name, price, customsFee);
				listProducts.add(produto);
								
			} else if(tipoProduto.toUpperCase().equals("USADO")) {
				
				System.out.println("Produto usado: qual é a data de uso? formato: dd/MM/yyyy");
				String manufactureDate = scanner.nextLine();
				
				ProductM produto = new UsedProduct(name, price, manufactureDate);
				listProducts.add(produto);
				
			}else {
				System.out.println("tente novamente, produto não classificado");
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(ProductM product: listProducts) {
			System.out.println( "produto Nome:"+ product.getName() 
			+ "produto preço: " + product.getPrice() + product.get);
		}
	}

}
