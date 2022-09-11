package list;

import java.util.Scanner;

public class Empregado {

	private String nome;
	private Integer id;
	private Double salario;
	
	public void leDados(Scanner sc, Integer i) 
	{
		System.out.println("Id: "+ i);
		this.setId(i);
		System.out.println("Nome:");
		sc.nextLine();
		String nome = sc.nextLine();
		this.setNome(nome);
		System.out.println("Salário:");
		Double salario = sc.nextDouble();
		this.setSalario(salario);
	}
	
	public void imprime() 
	{
		System.out.printf("Id: %d%n",this.getId());
		System.out.printf("Nome: %s%n",this.getNome());
		System.out.printf("Salario: %.2f%n",this.getSalario());
		System.out.println("-----------");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
