import java.util.Scanner;

public class Ejercicio22 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cuadrado());
	}

	public static int cuadrado() {
		int cuadrado = 0;
		System.out.println("Introduce un numero");
		int num = Integer.parseInt(teclado.nextLine());
		while (num > 0) {
			cuadrado = num * num;
			System.out.println("Introduce un numero");
			num = Integer.parseInt(teclado.nextLine());
		}
		return cuadrado;
	}
}
