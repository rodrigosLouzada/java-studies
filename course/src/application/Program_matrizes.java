package application;

import java.util.Scanner;

public class Program_matrizes {

	public static void main(String[] args) {

		System.out.println("qual o tamanho da matriz?");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[][] matri = new int [n][n];
		
		for(int i = 0 ; i< n; i ++) {
			for(int j = 0 ; j < n ; j ++) {
				System.out.println("digite um valor para adicionar");
				matri[i][j] = scanner.nextInt();
				System.out.println("um incremento");
			}
		}  
		System.out.println("fim do programa");
		
		
		
	}

}
