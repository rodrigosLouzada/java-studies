package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTestTry {

	public static void main(String[] args) {

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
		
		System.out.println("fim do programa");
		scanner.close();
	}

}
