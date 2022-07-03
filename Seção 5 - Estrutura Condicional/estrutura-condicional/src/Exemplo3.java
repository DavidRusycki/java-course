import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma idade para saber se pode tirar a carteira de motorista");
		int idade = scanner.nextInt();
		
		/* Se a idade for maior que 18*/
		if (idade > 18) 
		{
			System.out.println("Pode fazer a carteira de motorista");
		}
		/* Senão */
		else {
			System.out.println("Não pode fazer a carteira de motorista");
		}
		
		scanner.close();
	}

}
