package application;

import javax.security.auth.x500.X500Principal;

import entities.Account;
import entities.SavingsAccount;

public class ProgramAccountPoli {

	public static void main(String[] args) {

		// poliformismo
		Account acc1 = new Account(1001, "joao", 1000.0);
		Account acc2 = new SavingsAccount(1002, "gabriel", 1000.0, 0.01);
		
		acc1.withdraw(50.0);
		acc2.withdraw(50.0);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());

	}

}
