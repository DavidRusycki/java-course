package model.entities;

import model.exceptions.WithdrawException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance = 0.0;
	private Double withdrawLimit;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		this.setBalance(this.getBalance()+amount);
	}
	
	public void withdraw(Double amount) {
		
		if (amount > this.getBalance()) {
			throw new WithdrawException("Não há saldo suficiente.");
		}
		if (amount > this.getWithdrawLimit()) {
			throw new WithdrawException("O saque é maior que o limite permitido.");
		}
		
		this.setBalance(this.getBalance()-amount);
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
	private void setBalance(Double valor) {
		this.balance = valor;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
}
