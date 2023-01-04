package abstractClasses;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Enter the namber of tax payers:");
		Integer numberOfPayers = scann.nextInt();

		ArrayList<Person> list = new ArrayList<Person>(); 
		
		for (int i = 1; i <= numberOfPayers; i++) {
			
			System.out.println("Tax payer #"+i+" data:");
			
			System.out.print("Individual or company (i/c)?");
			char letter = scann.next().charAt(0);
			
			if (letter == 'c') {
				Company person = new Company();
				
				System.out.print("Name:");
				person.setName(scann.next());
				System.out.print("Anual Income:");
				person.setIncome(scann.nextDouble());
				System.out.print("Number of employees:");
				person.setNumberEmployees(scann.nextInt());
				
				list.add(person);
			}
			else {
				Individual person = new Individual();
				
				System.out.print("Name:");
				person.setName(scann.next());
				System.out.print("Anual Income:");
				person.setIncome(scann.nextDouble());
				System.out.print("Health expenditures:");
				person.setSpendHealth(scann.nextDouble());
				
				list.add(person);
			}
		}
		
		System.out.println("Taxes Paid");
		Double acumulator = 0.0;
		for(Person person: list) {
			acumulator += person.totalTaxes();
			System.out.println(person.getTextTotalTaxes());
		}
		
		System.out.println("Total taxes: $" + String.format("%.2f", acumulator));
		
		scann.close();
	}

}
