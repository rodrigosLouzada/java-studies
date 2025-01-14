package application;

import java.util.Scanner;

public class Linhas_matrizes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("quantas linhas terá a sua matriz?");
		int linhas = scanner.nextInt();
		
		System.out.println("quantas colunas terá a sua matriz?");
		int colunas = scanner.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		
		for(int i = 0 ; i<linhas ; i ++) {
			for(int j = 0 ; i < colunas ; j ++) {
				System.out.println("digite os valores para sua matriz: ---");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("digite um valor da matriz e descubra os números a volta!");
		
		int valorEscolhido = scanner.nextInt();
		
		for(int i = 0 ; i < linhas ; i ++) {
			for(int j = 0 ; j < colunas; j ++) {
				if(valorEscolhido == matriz[i][j] && i >= 0 && (i + 1) > linhas  && j >= 0 && j > colunas) {
					System.out.println("na linha: " + i + " na coluna: " + j);
				
					System.out.println("acima: " +  (i>0) ? matriz[i + - 1][j]);
				
				
				
				}
			}
		}
		
		
	}

}
