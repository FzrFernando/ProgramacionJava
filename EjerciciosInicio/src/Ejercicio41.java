import java.util.Scanner;

public class Ejercicio41 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero;
		System.out.println("Introduzca un numero");
		numero = teclado.nextLine();
		System.out.println(numeroReves(numero));
	}

	public static String numeroReves(String numero) {
		String numeroNuevo="";
		for (int i = numero.length()-1; i >= 0; i--) {
			numeroNuevo+= numero.charAt(i);
		}
		return numeroNuevo;
	}
}
