package entities;

public class Product {

	private String name;
	private Double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}
	
	public String toString()
	{
		return " Name: " + this.getName()
			+ " Price: " + String.format("%.2f", this.getPrice()) 
			+ " Quantity: " + this.getQuantity()
			+ " Total Value: " + String.format("%.2f", this.getTotalValueInStock());
	}
	
	public Double getTotalValueInStock()
	{
		double total = this.getPrice() * this.getQuantity();
		return total;
	}
	
	public String getName()
	{
		return this.name;
	}
	public Product setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Double getPrice()
	{
		return this.price;
	}
	public Product setPrice(Double price)
	{
		this.price = price;
		return this;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	public Product setQuantity(int quantity)
	{
		this.quantity = quantity;
		return this;
	}
	
}
