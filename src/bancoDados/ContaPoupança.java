package bancoDados;

public class ContaPoupanša extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupanša === ");
		super.imprimirInfosComuns();
	
	}
}
