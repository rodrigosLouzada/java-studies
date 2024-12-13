package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Triangle x, y, z;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("quais as medidas?");
		 x.a = scan.nextDouble();
		 x.b = scan.nextDouble();
		 x.c = scan.nextDouble();
		 double total = 0.0;
		 total += x.a + x.b + x.c ;
		 
		 System.out.println(" a soma dos lados é: " + total);
	}

}