package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private ArrayList<Installment> installments = new ArrayList<Installment>();
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.setNumber(number);
		this.setDate(date);
		this.setTotalValue(totalValue);
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public ArrayList<Installment> getInstallments() {
		return installments;
	}
	public void setInstallments(ArrayList<Installment> installments) {
		this.installments = installments;
	}
	public void addInstallment(Installment installment) {
		this.installments.add(installment);
	}
	public void removeInstallment(Installment installment) {
		this.installments.remove(installment);
	}
	
}
