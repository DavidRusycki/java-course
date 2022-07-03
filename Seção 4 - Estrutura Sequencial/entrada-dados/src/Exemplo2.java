import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		System.out.println("Segundo Exemplo");
		
		System.out.println("Digite um número:");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		System.out.println(numero);

		scanner.close();
	}
	
}
