import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {

		/*
		 * Estrutura condicional ternária
		 * Usada para não precisar colocar 3 linhas condições simples
		 */

		Scanner scanner = new Scanner(System.in);
		
		int a;

		System.out.println("Digite um número");
		a = scanner.nextInt();

		scanner.close();

		String text = a == 1 ? "Primeiro" : "Não sei";
		
		System.out.println(text);
	}

}
