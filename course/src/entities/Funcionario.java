package entities;



public class Funcionario {
	
	private String nome;
	private Integer id;
	private Double salario;
	
	public Funcionario(String nome, Integer id, Double salario) {
		
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalarial(Integer aumento) {
		this.salario += this.salario * aumento / 100.0;
	}
	
	
	public void mostrarFuncinarios() {
		System.out.println("seu id é : " + this.id + "--- funcinario nome: " + this.nome + "--- salario do funcinario" + this.salario);
	}
	
	
	/* se cada atributo fosse um arraylist, metódo para mostrar
	public void mostrarFuncinarios(Integer quatidadeFuncionarios) {
		for(Integer integer = 0; integer < quatidadeFuncionarios; integer ++) {
			System.out.println("nome: " + this.nome +
								"----salário: "	+ this.salario + "---id " + this.id	);
		} 
	} */
			
			
}
