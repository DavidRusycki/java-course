import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		System.out.println("Primeiro Exemplo");
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		System.out.println(text);

		scanner.close();
	}
	
}
