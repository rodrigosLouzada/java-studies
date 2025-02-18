package entities;

public class CompanyTax extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public CompanyTax() {}

	public CompanyTax(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double totalToPay = 0.0;
		
		if(numberOfEmployees < 10) {
			totalToPay += this.getAnualIncome() * 0.14;
		}else {
			totalToPay += this.getAnualIncome() * 0.16;
		}
		
		return Math.max(totalToPay, 0);
	}

}
