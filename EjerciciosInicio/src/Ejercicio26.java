import java.util.Scanner;

public class Ejercicio26 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIntroducido, sumaNum=0;
		String cadena, fin = "fin";
		
		System.out.println("Quieres introducir otro numero?(fin para salir");
		cadena = teclado.nextLine();	
		
		while (cadena != fin) {
			System.out.println("Introduce un numero");
			numeroIntroducido = Integer.parseInt(teclado.nextLine());
			sumaNum+=numeroIntroducido;
			System.out.println("Quieres introducir otro numero?(fin para salir");
			cadena = teclado.nextLine();
		}
		System.out.println(sumaNum);
	}
	
}
