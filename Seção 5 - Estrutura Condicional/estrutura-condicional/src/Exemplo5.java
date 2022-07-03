import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {

		/*
		 * Estrutura Switch case
		 * Usada para substituir vários if-else encadeados
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		
		int a;

		System.out.println("Digite um número");
		a = scanner.nextInt();

		scanner.close();
		
		switch (a) {
		case 1: {
			System.out.println("Primeiro");
			break;
		}
		case 2: {
			System.out.println("Segundo");
			break;
		}
		case 3: {
			System.out.println("Terceiro");
			break;
		}
		default:
			System.out.println("Esse valor não é suportado");
			break;
		}
				
	}

}
