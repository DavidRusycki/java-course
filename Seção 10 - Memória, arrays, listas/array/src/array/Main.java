package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números");
		int quantidade = scanner.nextInt();
		double[] array = new double[quantidade];
		int soma = 0;
		for(int indice = 0; indice < quantidade;indice++) {
			System.out.println("Digite o número "+(indice+1)+" do array:");
			double numero = scanner.nextDouble();
			array[indice] = numero;
			soma += numero;
		}
		
		double media = soma/quantidade;

		System.out.printf("Média é: %.2f%n", media);
		
		scanner.close();
	}

}
