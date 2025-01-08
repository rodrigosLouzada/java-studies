package application;

import java.util.Scanner;

import entities.Funcionarios;

public class Program_funcionarios {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("gostaria de adicionar quantos funcionarios?");
		Integer quatidadeFuncionarios = scanner.nextInt();
		Funcionarios funcionarios = new Funcionarios();
		
		Integer quantos = 0;
		
		if(quatidadeFuncionarios > 0) {} else {
			System.out.println("tente outra quantidade");
		}
		
		
		do {
			quantos ++;
		} while (quantos < quatidadeFuncionarios);
		
		for(Integer i = 0 ; i < quatidadeFuncionarios; i ++) {
			System.out.println("qual é o salario dele?");
			Double salario = scanner.nextDouble();
			
			System.out.println("qual é ID do funcinario?");
			Integer id = scanner.nextInt();
			
			System.out.println();
			
		}
		
	}

}
