package herancaPolimorfismo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Enter the number of products:");
		Integer numberProducts = scann.nextInt();
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		for (int i = 1; i <= numberProducts; i++) {
			
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char letter = scann.next().charAt(0);
			switch (letter) {
			case 'c':
				Product product = new Product();
				System.out.print("Name:");
				product.setName(scann.next());
				System.out.print("Price:");
				product.setPrice(scann.nextDouble());
				productList.add(product);
				break;
				
			case 'u':
				UsedProduct usedProduct = new UsedProduct();
				System.out.print("Name:");
				usedProduct.setName(scann.next());
				System.out.print("Price:");
				usedProduct.setPrice(scann.nextDouble());
				System.out.print("Manufacture date (DD/MM/YYYY):");
				usedProduct.setManufactureDateFromString(scann.next());
				productList.add(usedProduct);
				break;
				
			case 'i':
				ImportedProduct importedProduct = new ImportedProduct();
				System.out.print("Name:");
				importedProduct.setName(scann.next());
				System.out.print("Price:");
				importedProduct.setPrice(scann.nextDouble());
				System.out.print("Customs fee:");
				importedProduct.setCustomsFee(scann.nextDouble());
				productList.add(importedProduct);
				break;

			default:
				throw new Exception("Digite uma letra permitida.");
			}
	
		}

		System.out.println("PRICE TAGS:");
		for(Product product : productList) {
			System.out.println(product.priceTag());
		}
		
		scann.close();
	}

}
