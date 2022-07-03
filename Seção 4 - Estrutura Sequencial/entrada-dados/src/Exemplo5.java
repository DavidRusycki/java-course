import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		
		System.out.println("Quinto Exemplo");
		
		System.out.println("Digite 3 linhas de conteúdo:");
		Scanner scanner = new Scanner(System.in);

		String linha1 = scanner.nextLine();
		String linha2 = scanner.nextLine();
		String linha3 = scanner.nextLine();
		
		System.out.println(linha1);
		System.out.println(linha2);
		System.out.println(linha3);

		scanner.close();
	}
	
}
