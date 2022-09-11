package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados estão registrados?");
		Integer numeroEmpregados = sc.nextInt();
		
		List<Empregado> empregados = new ArrayList<>();
		
		for (int i = 0; i < numeroEmpregados; i++) {
			Empregado empregado = new Empregado();
			System.out.println("Empregado "+i);
			empregado.leDados(sc, i);
			
			empregados.add(empregado);
		}
		
		System.out.println("Digite o Id do empregado para dar um aumento");
		Integer idEmpregado = sc.nextInt();
		
		Empregado sorteado = empregados.stream().filter(x -> x.getId() == idEmpregado).findFirst().orElse(null);
		if (sorteado == null) 
		{
			System.out.println("Funcionado não existe");
		}
		else {

			System.out.println("Digite a porcentagem de aumento");
			Double porcentagemAumento = sc.nextDouble();
						
			sorteado.setSalario(sorteado.getSalario() + (sorteado.getSalario() * (porcentagemAumento/100)));
			
			System.out.println("Empregados");
			for(Empregado empregado: empregados)
			{
				empregado.imprime();
			}
		}
	}
	
}
