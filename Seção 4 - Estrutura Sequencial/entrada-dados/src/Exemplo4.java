import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		
		System.out.println("Quarto Exemplo");
		
		System.out.println("Digite uma letra:");
		Scanner scanner = new Scanner(System.in);
		/* Pega somente a primeira letra */
		char letra = scanner.next().charAt(0);
		System.out.println(letra);

		scanner.close();
	}
	
}
