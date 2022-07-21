import java.util.Scanner;

abstract public class Leitor {

	private Scanner scanner;
	
	public Scanner getScanner() {
		return scanner;
	}

	public void doIniciaScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public void doFinalizaScanner() {
//		this.scanner.close();
//		this.scanner = null;
	}
	
}
