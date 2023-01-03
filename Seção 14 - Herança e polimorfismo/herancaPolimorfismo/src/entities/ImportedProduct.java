package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.setCustomsFee(customsFee);
	}

	@Override
	public String priceTag() {
		return this.getName() + " $ " + this.totalPrice() + " (Customs Free: $ " + String.format("%.2f", this.getCustomsFee()) + ")";
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.getCustomsFee();
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
}
