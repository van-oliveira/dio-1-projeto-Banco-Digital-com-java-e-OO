package br.com.dio;

public class Main {

	public static void main(String[] args) {
		Clientes venilton = new Clientes();
		venilton.setNome("venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
                
	}

}
