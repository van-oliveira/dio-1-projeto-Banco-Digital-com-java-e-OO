package br.com.dio;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca (Clientes cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
			System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}

	@Override
	protected void saldo(double valor) {
		// TODO Auto-generated method stub
		
	}
		
	}
