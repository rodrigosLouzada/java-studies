package application;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("enter the number of employee: ");
		
		int n = scan.nextInt();
		
		for(int i = 1 ; i <= n; i ++) {
			
			System.out.println("o funcionario " + i + "é outsourced? SIM/NÃO?");
			
			String resposta = scan.nextLine().toUpperCase();
			
			System.out.println("employees name: ");
			String name = scan.nextLine();
			
		}
		
		
		scan.close();
	}

}
