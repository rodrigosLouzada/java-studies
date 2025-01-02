package entities;

public class Product_vetorAtributos {

	private String[] Arrayname;
	private Double[] Arrayprice;
	
	public Product_vetorAtributos(int size){
		
		this.Arrayname = new String[size];
		this.Arrayprice = new Double[size];
	}
	
	
	public void adicionarValoresVetor(String name, Double price, int indice) {
				
		this.Arrayname[indice] = name;
		this.Arrayprice[indice] = price;
		
		}
	 

	
}
