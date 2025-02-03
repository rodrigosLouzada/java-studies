package application;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcededEmployee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("enter the number of employee: ");
		
		int n = scan.nextInt();
		
		for(int i = 1 ; i <= n; i ++) {
			
			System.out.println("o funcionario " + i + "- é outsourced? SIM/NÃO?");
			
			String resposta = scan.nextLine().toUpperCase();
			
			System.out.println("employees name: ");
			String name = scan.nextLine();
			scan.nextLine();
			
			System.out.println("hours: ");
			Integer hours = scan.nextInt();
			scan.nextLine();
			
			System.out.println("value per hour: ");
			Double valuePerHour = scan.nextDouble();
			
			if(resposta.equals("SIM")) {
				System.out.println("additional charge: ");
				Double additionalCharge = scan.nextDouble();
				
				list.add(new OutsourcededEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}	
		}
		
		System.out.println("-------------");
		System.out.println("PAYMENTS: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " " + "$" + emp.payment());
		}
		scan.close();
	}
}
