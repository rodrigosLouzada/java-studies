package application;

import java.util.Scanner;

import entities.Aluno;
import entities.enums.AlunoDiversosValores;
import entities.enums.AlunoEnumSimples;

public class ProgramEnumTeste {

	public static void main(String[] args) {

		System.out.println("digite o seu nome: ");
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();
		
		System.out.println("se está aprovado ou reprovado: ");
		String status = scanner.next();
		
		System.out.println("digite a nota dele");
		Integer nota = scanner.nextInt();
		
		//AlunoEnumSimples alunn = AlunoEnumSimples.APROVADO; acesso direto
		//Aluno aluno = new Aluno(nome, nota, AlunoEnumSimples.valueOf(status.toUpperCase()));
		
		//AlunoDiversosValores alunoDiversos = AlunoDiversosValores.APROVADO;
		
		if(status.toUpperCase().equals(AlunoDiversosValores.APROVADO.getStatus())) {
			Aluno A1 = new Aluno(nome, nota, AlunoDiversosValores.APROVADO);
			System.out.println("sua nota é: " + AlunoDiversosValores.APROVADO.getNota());
		}else {
			Aluno A1 = new Aluno(nome, nota, AlunoDiversosValores.REPROVADO);
			System.out.println("sua nota é: " + AlunoDiversosValores.REPROVADO.getNota());

		}
		
		//System.out.println(aluno.toString());
		
		
		for(AlunoDiversosValores alun : AlunoDiversosValores.values()) {
			if(status.toUpperCase().equals(status)) {
				System.out.println("sua nota foi: " + alun.getNota());
			}
		} 

			
			
	}

}
