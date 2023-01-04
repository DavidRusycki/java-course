package entities;

public class Company extends Person {

	private Integer numberEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, Integer numberEmployees) {
		super(name, income);
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double totalTaxes() {
		Double taxe = this.getIncome() * 0.16;
		if (this.getNumberEmployees() > 10) {
			taxe = this.getIncome() * 0.14;
		}
		return taxe;
	}

	@Override
	public String getTextTotalTaxes() {
		return this.getName() + " $ " + String.format("%.2f", this.totalTaxes());
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
}
