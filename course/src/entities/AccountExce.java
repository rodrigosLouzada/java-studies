package entities;

import javax.security.auth.login.AccountException;

public class AccountExce {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public AccountExce() {}
	
	public AccountExce(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountException {
		if(withdrawLimit > balance) {
			throw new AccountException("o limite do saque não pode ser maior que o saldo");
		}
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws AccountException {
		if(amount > balance) {
			throw new AccountException("não há saldo suficiente, mude o valor saque");
		}else {
			balance -= amount;
		}
	}
	
}
