import java.util.Scanner;

public class Ejercicio19 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pedirNumeros());
	}

	public static int pedirNumeros() {
		int contador = 0, acum = 0, numero;
		while (contador < 15) {
			System.out.println("Introduce un numero");
			numero = Integer.parseInt(teclado.nextLine());
			acum = acum + numero;
			contador += 1;
		}
		return acum;
	}
}
