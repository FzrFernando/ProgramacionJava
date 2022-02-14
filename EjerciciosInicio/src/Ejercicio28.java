import java.util.Scanner;

public class Ejercicio28 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad, num1 = 0, num2 = 1, suma = 1;
		System.out.println("Introduce cuantos numeros quieres ver");
		cantidad = Integer.parseInt(teclado.nextLine());
        System.out.println(num1);
        for (int i = 1; i < cantidad; i++) {
            System.out.println(suma); 
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
	}

}
