package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			
			Account account = new Account();
			
			System.out.print("Number:");
			account.setNumber(scann.nextInt());
			System.out.print("Holder:");
			account.setHolder(scann.next());
			scann.nextLine();
			System.out.print("Initial balance:");
			account.deposit(scann.nextDouble());
			System.out.print("Withdraw limit:");
			account.setWithdrawLimit(scann.nextDouble());
		
			System.out.print("Enter amount for withdraw:");
			account.withdraw(scann.nextDouble());			
		}
		catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Error");
		}
		finally {
			scann.close();			
		}

	}

}

