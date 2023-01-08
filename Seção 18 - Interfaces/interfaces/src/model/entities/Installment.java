package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private LocalDate dueDate;
	private Double amount;
	public static DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment(LocalDate dueDate, Double amount) {
		this.setDueDate(dueDate);
		this.setAmount(amount);
	}
	
	@Override
	public String toString() {
		return Installment.dateTimeFormater.format(this.getDueDate()) + " - " + String.format("%.2f", this.getAmount());
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	} 
	
}
