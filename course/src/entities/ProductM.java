package entities;

public class ProductM {

	private String name;
	private Double price;
	
	public ProductM(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void priceTag() {
		System.out.println("nome do produto: " + this.getName() + " -- preco do produto:  " + this.getPrice());
	}
}
