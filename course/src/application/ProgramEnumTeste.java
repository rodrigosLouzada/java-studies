package application;

import java.util.Scanner;

import entities.Aluno;
import entities.enums.AlunoEnumSimples;

public class ProgramEnumTeste {

	public static void main(String[] args) {

		System.out.println("digite o seu nome, se está ativou ou não: ");
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();
		
		System.out.println("se está aprovado ou reprovado: ");
		String status = scanner.next();
		
		System.out.println("digite a nota dele");
		Integer nota = scanner.nextInt();
		
		Aluno aluno = new Aluno(nome, nota, AlunoEnumSimples.valueOf(status.toUpperCase()));
		
		System.out.println(aluno.toString());
	
	}

}
