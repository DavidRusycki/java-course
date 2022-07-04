import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		/* 
		 * Programa para somar enquanto o número lido for diferente de zero
		 */

		int numero = 1;
		int soma = 0;

		Scanner scanner = new Scanner(System.in);
		
		while(numero != 0)
		{
			System.out.println("Digite um número:");
			numero = scanner.nextInt();
			soma += numero;
		}
		
		scanner.close();
		System.out.println(soma);
	}

}
