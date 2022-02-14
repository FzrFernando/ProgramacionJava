import java.util.Scanner;

public class Ejercicio24 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numMayor());
	}

	public static int numMayor() {
		int contador, mayor = 0;
		System.out.println("Introduce un numero");
		int num = Integer.parseInt(teclado.nextLine());
		mayor = num;
		for (contador = 1; contador < 10; contador++) {
			System.out.println("Introduce un numero");
			num = Integer.parseInt(teclado.nextLine());
			if (num > mayor) {
				mayor = num;
			}
		}
		return mayor;
	}
}
