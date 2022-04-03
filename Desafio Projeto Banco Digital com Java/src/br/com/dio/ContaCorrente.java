package br.com.dio;

public class ContaCorrente extends Conta{

	public ContaCorrente (Clientes cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	protected void saldo(double valor) {
		// TODO Auto-generated method stub
		
	}
}
