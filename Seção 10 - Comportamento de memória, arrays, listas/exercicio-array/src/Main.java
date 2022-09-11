import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de pessoas a ser lido");
		int numeroPessoas = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[numeroPessoas];
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %d pessoa%n", i+1);
			
			Pessoa pessoa = new Pessoa();
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			pessoa.setNome(nome);
			
			System.out.println("Idade:");
			int idade = sc.nextInt();
			pessoa.setIdade(idade);
			
			pessoas[i] = pessoa;
		}
		
		Pessoa pessoaMaisNova = null;
		Pessoa pessoaMaisVelha = null;
		int menorIdade = pessoas[0].getIdade();
		int maiorIdade = pessoas[0].getIdade();
		
		for (int j = 0; j < pessoas.length; j++) 
		{
			
			if (menorIdade >= pessoas[j].getIdade()) 
			{
				menorIdade = pessoas[j].getIdade();
				pessoaMaisNova = pessoas[j];
			}
			
			if (maiorIdade <= pessoas[j].getIdade()) 
			{
				maiorIdade = pessoas[j].getIdade();
				pessoaMaisVelha = pessoas[j];
			}
		}
				
		System.out.println("Pessoa mais nova:");
		System.out.printf("Nome: %s%n", pessoaMaisNova.getNome());
		System.out.printf("Idade: %d%n", pessoaMaisNova.getIdade());
		
		System.out.println("Pessoa mais velha:");
		System.out.printf("Nome: %s%n", pessoaMaisVelha.getNome());
		System.out.printf("Idade: %d%n", pessoaMaisVelha.getIdade());
		
		sc.close();
	}

}
