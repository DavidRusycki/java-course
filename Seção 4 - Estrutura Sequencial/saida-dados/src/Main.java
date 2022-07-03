
public class Main {

	public static void main(String[] args) {

		System.out.println("Primeiro Exemplo");
		int x1,y1;
		
		x1 = 5;
		y1 = 2 * x1;
		
		System.out.println(x1);
		System.out.println(y1);
		
		System.out.println("Segundo Exemplo");
		int x2;
		double y2;
		
		x2 = 5;
		y2 = 2 * x2;
		
		System.out.println(x2);
		System.out.println(y2);
		
		System.out.println("Terceiro Exemplo");
		double y3, b3, B3, h1, area;
		
		b3 = 6.0;
		B3 = 8.0;
		h1 = 5.0;
		
		area = (b3 + B3) / 2.0 * h1;
		
		System.out.println(area);

		System.out.println("Quarto Exemplo");
		int a4, b4;
		double resultado4;
		
		a4 = 5;
		b4 = 2;
		
		/* Resulta em 2 sendo que era pra ser 2.5 */
		resultado4 = a4 / b4;
		
		System.out.println(resultado4);
		
		/* Casting */
		resultado4 = (double) a4 / b4;
		
		System.out.println(resultado4);
		
		
		System.out.println("Quinto Exemplo");
		double a5;
		int b5;
		
		a5 = 6.0;
		/* Necessário colocar o casting se não não roda */
		b5 = (int) a5;
		
		System.out.println(b5);
	}

}
