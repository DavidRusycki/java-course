import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char denovo;
		do {
			
			System.out.println("Digite um número para saber sua tabuada");
			int numero = scanner.nextInt();

			for (int indice = 0; indice <= 10; indice++) {
				System.out.println(indice+" X "+numero+" = "+indice*numero);
			}
			
			System.out.println("Deseja uma nova tabuada ? (s/n)");
			denovo = scanner.next().charAt(0);
		}while(denovo != 'n');

		scanner.close();
	}

}
