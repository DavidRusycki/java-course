package Main;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		/* Ler dados de um triangulo e calcular a sua área */

		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();
		
		Scanner scanner = new Scanner(System.in);
		lerDadosTriangulo(triangle1, scanner);
		lerDadosTriangulo(triangle2, scanner);
		scanner.close();
		
		System.out.print("Area Triangulo 1 :");
		System.out.println(triangle1.getArea());
		
		System.out.print("Area Triangulo 2 :");
		System.out.println(triangle2.getArea());
	}

	public static void lerDadosTriangulo(Triangle triangle, Scanner scanner)
	{
		System.out.println("Digite o lado 1");
		triangle.setLado1(scanner.nextDouble());
		System.out.println("Digite o lado 2");
		triangle.setLado2(scanner.nextDouble());
		System.out.println("Digite o lado 3");
		triangle.setLado3(scanner.nextDouble());
	}
	
}
