package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Dinho", 0.0);
		BusinessAccount bac = new BusinessAccount(1002, "bolsonaro", 0.0, 2026.0);
		
		//upcasting
		
		Account acc1 = bac;
		Account acc2 = new BusinessAccount(1003, "mito", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "jair", 0.0, 0.1);
		
		//downcasting, only w/ casting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// downcasting from brothres it's not okay, even if casting
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		// use of instanceof
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("update!");
		}
	}

}
