import java.util.Scanner;

public class Ejercicio27 {
	
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldoPedido, sumaSueldos = 0, mayorQueMil=0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Introduzca tu sueldo");
			sueldoPedido = Integer.parseInt(teclado.nextLine());
			sumaSueldos+=sueldoPedido;
			if (sueldoPedido > 1000) {
				mayorQueMil+=1;
			}
		}
		System.out.println("La suma de los sueldos es " + sumaSueldos);
		System.out.println("Hay " + mayorQueMil + " sueldos mayor que 1000");
	}

}
