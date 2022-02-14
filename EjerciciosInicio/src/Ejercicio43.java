import java.util.Scanner;

public class Ejercicio43 {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la cadena");
		String cadena = teclado.nextLine();
		System.out.println(cambiaCadena(cadena));
	}

	public static String cambiaCadena(String cadena) {
		String cadenaNueva = "";
		for (int i = 1; i < cadena.length(); i = i+2) {
			cadenaNueva = cadenaNueva + cadena.charAt(i) + cadena.charAt(i-1);
		}
		if (cadena.length()%2 == 1) {
			cadenaNueva = cadenaNueva + cadena.charAt(cadena.length()-1);
		}
		return cadenaNueva;
	}
}
