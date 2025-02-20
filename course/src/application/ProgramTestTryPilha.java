package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTestTryPilha {

	public static void main(String[] args) {

		method1();
	}
	
	public static void method1() {
		System.out.println("comeco do metodo 1");
		method2();
		System.out.println("fim do programa 2");
	}
	
	public static void method2() {
		
		System.out.println("comco do metodo----");
		Scanner scanner = new Scanner(System.in);
		
		try {
			String[] vect = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posicao invalida");
		} catch (InputMismatchException e) {
			System.out.println("input error!");
		}
		
		scanner.close();
		System.out.println("fim do programa");
	}

}
