package entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private ArrayList<HourContract> contracts;
	private Department department;
	
	public Worker() {
		this.contracts = new ArrayList<HourContract>();
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer mounth) {
		Double result = this.getBaseSalary();
		
		for (HourContract contract: contracts) {
			LocalDate localdate = LocalDate.ofInstant(contract.getDate().toInstant(), ZoneOffset.ofHours(-3));
			if (localdate.getMonthValue() == mounth && localdate.getYear() == year) {
				result += contract.totalValue();
			}
		}
		
		LocalDate local = LocalDate.of(year, mounth, 1);
		
		this.printIncome(result, local);
		
		return result;
	}
	
	private void printIncome(Double result, LocalDate localDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");
		System.out.println("Name: "+ this.getName());
		System.out.println("Department: "+ this.getDepartment().getName());
		System.out.println("Income for "+dtf.format(localDate)+": "+ result);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public ArrayList<HourContract> getContracts() {
		return contracts;
	}
	public void setContracts(ArrayList<HourContract> contracts) {
		this.contracts = contracts;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
