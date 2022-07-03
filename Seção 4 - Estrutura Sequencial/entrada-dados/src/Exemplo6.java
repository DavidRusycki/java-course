import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		
		System.out.println("Sexto Exemplo");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scanner.nextInt();
		/* Ao usar um nextLine após um leitor parcial gerará uma quebra de linha desse modo pode bugar então seria necessário adicioanr um scanner.nextLine() antes do próximo .nextLine() */
		
		System.out.println("Digite a linha 1");
		String linha1 = scanner.nextLine();
		System.out.println("Digite a linha 2");
		String linha2 = scanner.nextLine();
		System.out.println("Digite a linha 3");
		String linha3 = scanner.nextLine();
		
		System.out.println("Resultados");
		System.out.println(numero);
		System.out.println(linha1);
		System.out.println(linha2);
		System.out.println(linha3);

		scanner.close();
	}
	
}
