package entities;

public class Individual extends Person {

	private Double spendHealth;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double income, Double spendHealth) {
		super(name, income);
		this.spendHealth = spendHealth;
	}

	@Override
	public Double totalTaxes() {
		Double taxe = 0.0;
		if (this.getIncome() < 20000.00) {
			taxe = this.getIncome() * 0.15;
		}
		else {
			taxe = this.getIncome() * 0.25;
		}
		
		if (this.getSpendHealth() > 0) {
			taxe -= this.getSpendHealth() * 0.5;
		}
		
		return taxe;
	}

	@Override
	public String getTextTotalTaxes() {
		return this.getName() + " $ " + String.format("%.2f", this.totalTaxes());
	}

	public Double getSpendHealth() {
		return spendHealth;
	}

	public void setSpendHealth(Double spendHealth) {
		this.spendHealth = spendHealth;
	}
	
}
