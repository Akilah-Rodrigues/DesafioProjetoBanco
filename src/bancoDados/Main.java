package bancoDados;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanša();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
