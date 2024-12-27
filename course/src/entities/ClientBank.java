package entities;

public class ClientBank {
	
	private Integer numeroConta; //não pode ser mudado apos inserção
	public String nomeCliente; // pode mudar sempre
	private Double saldo = 0.0;
	private Double custodeSaqueInteger = 5.0;
	/* pode aumentar somente com F. deposito , so pode diminuir com o o saldo,
	pode ficar negativo, deve ser mostrado sempre , cada saque deve custar 5.00, pode ficar negativo*/  
	
	
	public void cadastroConta(Integer numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		
	}
	
	private void mostrarDadosCliente() {
		System.out.println(this.nomeCliente + "  " + this.numeroConta +
							"  " + this.saldo + "  " );
	}
	
	
	
	public void deposito(double deposito) {
		
		this.saldo += deposito;
		mostrarDadosCliente();
	}
	
	public void saque(double valorSacado) {
		
		this.saldo -= valorSacado - custodeSaqueInteger;
		mostrarDadosCliente();
	}
	
	
}
