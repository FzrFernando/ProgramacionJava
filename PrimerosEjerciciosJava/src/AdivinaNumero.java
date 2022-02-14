import java.util.Scanner;

public class AdivinaNumero {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,adivinar,intentos = 1;
		
		num = (int) (Math.random()*100);
		System.out.println("Introduce un numero");
		adivinar = Integer.parseInt(teclado.nextLine());
		
		while (adivinar != num) {
			if (adivinar > num) {
				System.out.println("Tu numero es mas grande");
			}
			else {
				System.out.println("Tu numero es mas pequeño");
			}
			intentos += 1;
			System.out.println("Introduce un numero");
			adivinar = Integer.parseInt(teclado.nextLine());
		}
		System.out.println("Has acertado en " + intentos + " intentos");
	}

}
