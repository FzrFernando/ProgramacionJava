import java.util.Scanner;

public class HolaMundo {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		int a,b;
		char opc;
		Double real,resultado;
		
		System.out.println("Introduce un numero");
		a = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce otro numero");
		real = Double.parseDouble(teclado.nextLine());
		System.out.println("¿Quieres calcular la suma(S/N)?");
		opc=teclado.nextLine().charAt(0);
		resultado = a+real;
		System.out.println("El valor de sumar " + a + " + " + real + " = " + resultado);
		System.out.println("La opcion leida es: " + opc);
	}

}
