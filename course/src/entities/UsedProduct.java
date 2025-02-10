package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductM {
	
	private Date manufactureDate; // fazer o string para o date no construtor!!
	

	public UsedProduct(String name, Double price, String manufactureDate) throws ParseException {
		super(name, price);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.manufactureDate = sdf.parse(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public void priceTag() {
		System.out.println("nome do produto: " + this.getName() + " -- preco do produto:  " + this.getPrice()
		+ "data de uso: " + this.getManufactureDate());

	}
	
	
}
