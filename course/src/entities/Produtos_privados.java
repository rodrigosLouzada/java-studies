package entities;

public class Produtos_privados {

	private String name;
	private Double price;
	
	public Produtos_privados(String name, Double price){
		
		this.name = name;
		this.price = price;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	
	
}
