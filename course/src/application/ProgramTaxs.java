package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyTax;
import entities.IndidvidualTax;
import entities.TaxPayer;

public class ProgramTaxs {

	public static void main(String[] args) {

		
		List<TaxPayer> listTaxPayers = new ArrayList<TaxPayer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("quantos contribuintes?");
		Integer numContr = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < numContr ; i ++) {
			
			System.out.println("qual é o nome? ");
			String name = scanner.nextLine();
			
			System.out.println("qual é a renda?");
			Double anualIncome = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("qual é o tipo de contribuinte, PJ OU PF?");
			String tipoEmpresa = scanner.nextLine();
			
			
			if(tipoEmpresa.toUpperCase().equals("PF")) {
			
				System.out.println("quanto é a despesa médica?");
				Double healthExpen = scanner.nextDouble();
				scanner.nextLine();
				
				IndidvidualTax PF = new IndidvidualTax(name, anualIncome, healthExpen);
				listTaxPayers.add(PF);
				
			}else {
				System.out.println("quanto empregados tem a sua PJ?");
				Integer numberOfEmployees = scanner.nextInt();
				scanner.nextLine();
				
				CompanyTax PJ = new CompanyTax(name, anualIncome, numberOfEmployees);
				listTaxPayers.add(PJ);
			}	
		}	
		
		Double totalTax= 0.0;

		for(int i = 0 ; i < numContr ; i++) {
			System.out.println("taxas das empresas: ");
			System.out.println("nome " + listTaxPayers.get(i).getName() + "  :"
			+ listTaxPayers.get(i).tax());
			totalTax += listTaxPayers.get(i).tax();
			
		}
		System.out.println("total pago:" + totalTax);
		scanner.close();
	}

}
