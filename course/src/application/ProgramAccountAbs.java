package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccountAbs {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<Account>();
		
		list.add(new SavingsAccount(1001,"mito", 500.0, 0.01));
		list.add(new BusinessAccount(1001,"bolsomito", 500.0, 400.0));
		
		Double sum = 0.0;
		
		for(Account c : list) {
			sum += c.getBalance();
		}
		System.out.println(sum);
	}

}
