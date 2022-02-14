import java.util.Scanner;

public class Ejercicio25 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIntroducido, contadorNum = 0, sumaImpares=0, contadorImpares = 0, mayorPares = 0;
		
		System.out.println("Introduce un numero");
		numeroIntroducido = Integer.parseInt(teclado.nextLine());
		
		while (numeroIntroducido > 0) {
			contadorNum++;
			if (numeroIntroducido % 3 == 0) {
				contadorImpares++;
				sumaImpares+=numeroIntroducido;
			}
			else {
				if (numeroIntroducido > mayorPares) {
					mayorPares = numeroIntroducido;
				}
			}
			System.out.println("Introduce otro numero");
			numeroIntroducido = Integer.parseInt(teclado.nextLine());
		}
		System.out.println("Se han introducido " + contadorNum + " numeros");
		System.out.println("La media de los impares es " + sumaImpares/contadorImpares);
		System.out.println("El mayor de los pares es el " + mayorPares);
	}

}
