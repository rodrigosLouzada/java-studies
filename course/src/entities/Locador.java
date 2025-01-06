package entities;

public class Locador {
	
	private String[] email = new String[9];
	private String[] nome = new String[9];
	private Integer[] numeroQuarto = new Integer[9];
	
	public Locador() {
		
	}
	
	public  void AdicionarLocador(String email, String nome, Integer numeroQuarto) {
		this.email[numeroQuarto] = email;
		this.nome[numeroQuarto] = nome;
		this.numeroQuarto[numeroQuarto] = numeroQuarto;
	}
	
	public Integer getNumeroQuarto(Integer numeroQuarto) {
		return this.numeroQuarto[numeroQuarto] ;
	}
	
	public void MostrarQquartos() {
		 
			for(int i = 0 ; i < 9 ; i ++) {
				
				if(numeroQuarto[i] != null) {
				
				System.out.println("quarto " + numeroQuarto[i] 
						+ "está ocupado " + "locador: " + nome[i]
						+ " email: " + email[i]);
				
				}
			}		
		}
}
