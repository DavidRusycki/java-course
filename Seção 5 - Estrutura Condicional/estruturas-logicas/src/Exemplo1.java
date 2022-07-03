
public class Exemplo1 {

	public static void main(String[] args) {


		/*
		 * Operadores lógicos
		 * 
		 * &&
		 * ||
		 * !
		 * 
		 * */
		
		int x = 5;
		
		if (x == 5 && x < 4) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (x == 5 || x < 4) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (!(x == 5)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
