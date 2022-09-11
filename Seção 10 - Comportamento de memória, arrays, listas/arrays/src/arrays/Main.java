package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		double[] vetor = new double[4];
		
		for (int i = 0; i < numero; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < numero; i++) {
			soma += vetor[i];
		}
		
		System.out.printf("Resultado: %.2f%n",soma/numero);
		
		sc.close();
	}

}
