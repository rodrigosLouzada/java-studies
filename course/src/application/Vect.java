package application;

import java.util.Scanner;

public class Vect {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite algum número para o tamanho do vetor");
		
		int tamanhoVetor = scanner.nextInt();
		
		int[] numeros = new int[tamanhoVetor];

		
		for(int i = 0; i<tamanhoVetor ; i ++) {
			System.out.println("digite um numero para multiplicar por 2");
			
			numeros[i] = scanner.nextInt();
			
			System.out.println(numeros[i] * 2);
			
		}
		
		
		scanner.close();
	}

}
