import java.util.Locale;

public class Main extends Leitor{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Main self = new Main();
		
		self.doIniciaScanner();
		
		System.out.println("Digite o nome da pessoa");
		String name = self.getScanner().next();
		System.out.println("Digite se terá ou não deposito inicial");
		Boolean initial = self.getScanner().nextBoolean();
		
		Account conta = null;
		
		if (initial) {
			conta = new Account(name, 0.0, initial);
		}
		else {
			conta = new Account(name, 0.0);
		}
		
		conta.deposit();
		conta.printBalance();
		conta.withdraw();
		conta.printBalance();
		
		self.doFinalizaScanner();
		System.out.println("Finalizado com sucesso!");
	}

}
