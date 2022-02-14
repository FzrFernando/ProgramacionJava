import java.util.Scanner;

public class Ejercicio42 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contrasenna;
		System.out.println("Introduzca una contraseña");
		contrasenna = teclado.nextLine();
		System.out.println(comprobarContrasenna(contrasenna));
	}

	public static String comprobarContrasenna(String cadena) {
		boolean banderaLongitud=false, banderaMayusculas=false, banderaMinusculas=false, banderaPuntuacion=false,banderaDigito=false;
		String comprobacion;
		for (int i = 0; i <= cadena.length()-1; i++) {
			if (cadena.length() >= 8) {
				banderaLongitud = true;
			}
			if (cadena.charAt(i) >= 65 && cadena.charAt(i) <= 90) {
				banderaMayusculas = true;
			}
			if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122) {
				banderaMinusculas = true;
			}
			if (cadena.charAt(i) == 44 || cadena.charAt(i) == 46 || cadena.charAt(i) == 58 || cadena.charAt(i) == 59) {
				banderaPuntuacion = true;
			}
			if (cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57) {
				banderaDigito = true;
			}
		}
		if (banderaLongitud == true && banderaMayusculas == true && banderaMinusculas == true && banderaPuntuacion == true && banderaDigito == true) {
			comprobacion = "Fuerte";
		}
		else {
			comprobacion = "Debil";
		}
		return comprobacion;
		
	}
}
