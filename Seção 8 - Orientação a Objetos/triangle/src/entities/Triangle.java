package entities;

public class Triangle {

	private double lado1;
	private double lado2;
	private double lado3;

	public double getArea()
	{
		double area = (this.getLado1() * this.getLado2()) / 2;
		
		return area;
	}
	
	public double getLado1()
	{
		return this.lado1;
	}
	public Triangle setLado1(double numero)
	{
		this.lado1 = numero;
		return this;
	}
	
	public double getLado2()
	{
		return this.lado2;
	}
	public Triangle setLado2(double numero)
	{
		this.lado2 = numero;
		return this;
	}
	
	public double getLado3()
	{
		return this.lado3;
	}
	public Triangle setLado3(double numero)
	{
		this.lado3 = numero;
		return this;
	}
	
}
