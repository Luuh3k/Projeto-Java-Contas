import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco banco = new Banco();

        ArrayList<Conta> contas = new ArrayList<Conta>();

        contas.add(cc);
        contas.add(poupanca);

        banco.setContas(contas);

        System.out.println(banco.getContas());
        
	}

}
