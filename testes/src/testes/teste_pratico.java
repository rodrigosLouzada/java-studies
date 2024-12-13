package testes;

import java.util.ArrayList;
import java.util.Scanner;

public class teste_pratico {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		ArrayList<String> nomesAlunoS = new ArrayList<String>(); 
		ArrayList<Integer> notasAlunos = new ArrayList<Integer>();
				
		
		do {
			System.out.println("adicione outro nome de aluno e sua respectivas 3 notas, máximo 3 de cada ?");
			String nome = scann.next();
			Integer nota = scann.nextInt();
			Integer nota2 = scann.nextInt();
			Integer nota3 = scann.nextInt();

			nomesAlunoS.add(nome);
			notasAlunos.add(nota);
			notasAlunos.add(nota2);
			notasAlunos.add(nota3);


		} while(nomesAlunoS.size() <= 2);
		
		for(int i = 0; i <= 2; i ++) {
			double mediaPorAluno = (notasAlunos.get(i) + notasAlunos.get(i+ 1)+ notasAlunos.get(i + 2))/3;
			System.out.println("o aluno: " + nomesAlunoS.get(i) +
								"e sua nota em média foi: " + mediaPorAluno);
		}            	
	}
}
