import java.util.Scanner;

public class Account extends Leitor{

	private String titularName;
	private Double balance;
	
	public Account(String titularName, Double balance) {
		this.titularName = titularName;
		this.balance = balance;
	}
	
	public Account(String titularName, Double balance, Boolean initialDeposit) {
		this.titularName = titularName;
		this.balance = balance;
		if (initialDeposit) {
			this.deposit();
		}
	}

	public void deposit() {
		this.doIniciaScanner();
		System.out.println("Digite o valor a depositar");
		Double quantity = this.getScanner().nextDouble();
		this.balance += quantity;
	}
	
	public void withdraw() {
		this.doIniciaScanner();
		System.out.println("Digit o valor a sacar");
		Double quantity = this.getScanner().nextDouble();
		this.balance -= quantity;
	}
	
	public void printBalance() {
		System.out.println(this.titularName+" Você possui um saldo de: " + this.balance);
	}
	
	public String getTitularName() {
		return titularName;
	}

	public Account setTitularName(String titularName) {
		this.titularName = titularName;
		return this;
	}

	public Double getBalance() {
		return balance;
	}

	public Account setBalance(Double balance) {
		this.balance = balance;
		return this;
	}

}
