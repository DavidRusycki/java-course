package product;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Name");
		String name = scanner.nextLine();
		System.out.println("Digite o Preço");
		double price = scanner.nextDouble();
		System.out.println("Digite a quantidade");
		int quantity = scanner.nextInt();
		
		scanner.close();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product);
	}

}
