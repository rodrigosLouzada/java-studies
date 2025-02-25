package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import entities.AccountExce;

public class ProgramAccountExce {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<AccountExce> accounts = new ArrayList<AccountExce>();

		System.out.println("quantas contas quer abrir?");
		Integer num = scanner.nextInt();
		System.out.println("entre com os dados para conta: ");
		
		
		for(int i = 0; i < num; i ++) {
			try {
				System.out.println("numero da conta:");
				Integer number = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("qual é o titular?");
				String holder = scanner.nextLine();
				
				System.out.println("qual é o saldo inicial?");
				Double balance = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("qual é o limite de saldo?");
				Double withdraw = scanner.nextDouble();
				scanner.nextLine();
				
				AccountExce accountExce = new AccountExce(number, holder, balance, withdraw);
				accounts.add(accountExce);
				
				System.out.println("quer realizar um saque? SIM ou NÃO");
				String respota1 = scanner.nextLine();
				if(respota1.toUpperCase().equals("SIM")) {
					
					System.out.println("de quanto é o saque?");
					Double amount = scanner.nextDouble();
					scanner.nextLine();
					accounts.get(i).withdraw(amount);
				}
		}catch (AccountException e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("erro inesperado!");
		}
	}	
		
		for(int j = 0; j < accounts.size(); j++) {
			System.out.println("holder: " + accounts.get(j).getHolder()
						+ " number : " + accounts.get(j).getNumber() 
						+ " balance: " + accounts.get(j).getBalance());
		}
		
		
		scanner.close();
	} 
}
