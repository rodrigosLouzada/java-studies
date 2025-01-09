package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program_funcionarios {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("gostaria de adicionar quantos funcionarios?");
		Integer quatidadeFuncionarios = scanner.nextInt();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		
		for(Integer i = 0 ; i < quatidadeFuncionarios; i ++) {
			System.out.println("qual é o salario dele?");
			Double salario = scanner.nextDouble();
			
			
			System.out.println("qual é ID do funcinario?");
			Integer id = scanner.nextInt();
			
			System.out.println("qual é o nome dele?");
			String nome = scanner.next();
			
			funcionarios.add(new Funcionario(nome, id, salario));
			
			System.out.println("----novo aluno adicionado-------");
			
		}
		
		System.out.println("quer aumentar o salario de alguém, SIM ou NAO?");
		String resposta = scanner.next();
		
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
		
		
		
		
	}

}
