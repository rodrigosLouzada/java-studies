package application;

import java.util.Scanner;

import util.Calculator;

public class Program_3 {
	
	//public static final double PI = 3.14;

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("digite um raio para o resultado");
		double raio = scan.nextDouble();
		
		double circu = cal.circunferencia(raio);
		double vol = cal.vol(raio);
		
		System.out.println("valores calculados: " + circu + "  " + vol);
		
		/*
		double circuferencia = circunferencia(raio);
		double volume = vol(raio);
		*/
		
		//System.out.println("o valor da circuferencia: " + circuferencia + "    o valor do volume: " + volume);
		
		
		scan.close();
	}
	
/*	public static double circunferencia(double raio) {
		
		return 2.0 * PI ;
	}
	
	public static double vol (double raio) {
		return 4.0 * PI * raio * raio * raio /3.0;
	}
*/
}
