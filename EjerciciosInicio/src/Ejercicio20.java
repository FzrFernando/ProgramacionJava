import java.util.Scanner;

public class Ejercicio20 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiplo3());
	}
	
	public static String multiplo3() {
		String cadenafinal = "";
		int i = 0, numero;
		while (i<5) {
			System.out.println("Introduce un numero");
			numero = Integer.parseInt(teclado.nextLine());
			if (numero%3==0) {
				cadenafinal += numero + " es multiplo de 3" + "\n";
			}
			i+=1;
		}
		return cadenafinal;
	}
	
	
}
