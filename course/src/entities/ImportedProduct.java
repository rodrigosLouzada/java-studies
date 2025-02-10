package entities;

public class ImportedProduct extends ProductM {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		customsFee = this.customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public void priceTag() {
		System.out.println("nome do produto: " + this.getName() + " -- preco do produto:  " + this.getPrice() 
		+ "a taxa adicional de importacao: " + this.getCustomsFee());

	}
	
	
	
	public Double totalPrice() {
		return this.getPrice() + customsFee;
	}
}
