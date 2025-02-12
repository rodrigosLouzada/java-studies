package entities;

public class IndidvidualTax extends TaxPayer{

	private Double healthExpen;
	
	
	private IndidvidualTax() {}
	
	public IndidvidualTax(String name, Double anualIncome, Double healthExpen) {
		super(name, anualIncome);
		this.healthExpen = healthExpen;
	}

	public Double getHealthExpen() {
		return healthExpen;
	}

	public void setHealthExpen(Double healthExpen) {
		this.healthExpen = healthExpen;
	}

	@Override
	public Double tax() {
		Double taxToPay = 0.0;
		
		if(this.getAnualIncome() < 20000) {
			taxToPay += (this.getAnualIncome() * 0.15) - (this.getHealthExpen() * 0.5);
		}else {
			taxToPay += (this.getAnualIncome() * 0.25) - (this.getHealthExpen() * 0.5);
		}
		
		return Math.max(taxToPay, 0);
	}

}
