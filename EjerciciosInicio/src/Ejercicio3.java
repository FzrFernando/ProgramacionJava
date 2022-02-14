import java.util.Scanner;

public class Ejercicio3 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int caracter;
		System.out.println("Introduce un caracter");
		caracter=teclado.nextLine().charAt(0);
		
		if (caracter >= 65 && caracter <= 90) {
			System.out.println("Letra Mayuscula");
		}
		else if (caracter >= 97 && caracter <= 122) {
			System.out.println("Letra Minuscula");
		}
		else if (caracter >= 48 && caracter <= 57) {
			System.out.println("Digito entre 0 y 9");
		}
		else if (caracter == 44 || caracter == 46 || caracter == 58 || caracter == 59) {
			System.out.println("Signo de puntuacion");
		}
		else if (caracter == 32) {
			System.out.println("Espacio");
		}
		else if (caracter == 40 || caracter == 41 || caracter == 123 || caracter == 125) {
			System.out.println("Parentesis o llaves");
		}
		else {
			System.out.println("Otro caracter");
		}
	}

}
