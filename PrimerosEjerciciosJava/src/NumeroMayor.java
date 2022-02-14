import java.util.Scanner;

public class NumeroMayor {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		
		System.out.println("Introduce un numero");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce otro numero");
		num2 = Integer.parseInt(teclado.nextLine());
		
		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor que " + num2);
		}
		else if (num1 < num2) {
			System.out.println("El numero " + num2 + " es mayor que " + num1);
		}
		else {
			System.out.println("Los numeros son iguales");
		}
	}

}
//Esto es un comentario de prueba