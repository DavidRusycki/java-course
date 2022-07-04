package product;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();

		System.out.println("Digite o Name");
		product.setName(scanner.nextLine());
		System.out.println("Digite o Preço");
		product.setPrice(scanner.nextDouble());
		System.out.println("Digite a quantidade");
		product.setQuantity(scanner.nextInt());
		
		scanner.close();
		
		System.out.println(product);
	}

}
