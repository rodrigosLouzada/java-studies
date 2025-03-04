package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program_funcionarios {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("gostaria de adicionar quantos funcionarios, quantos?");
		Integer quatidadeFuncionarios = scanner.nextInt();
		scanner.nextLine();
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		
		for(Integer i = 0 ; i < quatidadeFuncionarios; i ++) {
			
			System.out.println("qual é o salario dele?");
			Double salario = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("qual é ID do funcinario?");
			Integer id = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("qual é o nome dele?");
			String nome = scanner.nextLine();
			
			funcionarios.add(new Funcionario(nome, id, salario));
			
			System.out.println("----novo aluno adicionado-------");
			
		}
		
		
		System.out.println("quer aumentar o salario de alguém, SIM ou NAO?");
		String resposta = scanner.next().toUpperCase();
		
		System.out.println("Forneça o ID: ");
		Integer possivelID = scanner.nextInt(); // talvez mudar o escopo
		
		System.out.println("qual é a %?");
		Integer aumento = scanner.nextInt();
		
		if(resposta.equals("SIM")) {
			
			
			for(Funcionario funcionario : funcionarios) {
				if(funcionario.getId() == possivelID) {
					funcionario.aumentoSalarial(aumento);
				}
			}
			
		}else {
			System.out.println("o ID : " + possivelID + "não existe entre os funcionarios");
		}
		
		System.out.println("------seus funcionario e dados são: ------");
		for(Funcionario funcionario : funcionarios) {
			funcionario.mostrarFuncinarios();
		}
		
		
	}

}
