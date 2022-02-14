import java.util.Scanner;

public class Ejercicio21 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumar100());
	}
	

	public static int sumar100() {
		int suma = 0;
		System.out.println("Introduce un numero");
		int num = Integer.parseInt(teclado.nextLine());
		for (int i = 0; i < 100; i++) {
			suma += (num + 1);
		}
		return suma;
	}
}
