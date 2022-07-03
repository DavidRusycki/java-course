import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		System.out.println("Terceiro Exemplo");
		
		/* Locale é necessário para que sejam usados números com ponto e não com vírgula */
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número Double:");
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		System.out.println(numero);

		scanner.close();
	}
	
}
