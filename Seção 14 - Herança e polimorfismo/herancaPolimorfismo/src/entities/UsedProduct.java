package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;
	private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String manufactureDate) {
		super(name, price);
		LocalDate date = LocalDate.parse(manufactureDate, this.getFormat());
		this.setManufactureDate(date);
	}

	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + String.format("%.2f", this.getPrice()) + "(Manufacture date: " + this.getManufactureDate().format(this.getFormat()) + ")";
	}
	
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDateFromString(String manufactureDate) {
		LocalDate date = LocalDate.parse(manufactureDate, this.getFormat());
		this.manufactureDate = date;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	private DateTimeFormatter getFormat() {
		return UsedProduct.format;
	}
	
}
