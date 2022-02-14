import java.util.Scanner;

public class Ejercicio6 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = leerInteger("Introduce un mes");
		int dia = leerInteger("Introduce un dia");
		
		System.out.println(decirEstacion(mes, dia));
	}
	
	public static int leerInteger(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String decirEstacion(int mes, int dia) {
		String estacion="";
		if ((mes >= 3 && dia >= 21) || (mes <= 6 && dia <= 21)) {
			estacion = "Primavera->20";
		}
		else if (mes <= 9 && dia <= 22) {
			estacion = "Verano->24";
		}
		else if (mes <= 12 && dia <= 21) {
			estacion = "Otoño->19";
		}
		else {
			estacion = "Invierno->19";
		}
		return estacion;
		
	}

}
