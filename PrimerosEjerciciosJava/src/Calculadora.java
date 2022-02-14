import java.util.Scanner;

public class Calculadora {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,resultado = 0;
		char opc,operacion;
		boolean error = false;
		
//		System.out.println("Introduce un numero");
//		num1 = Integer.parseInt(teclado.nextLine());
//		System.out.println("Introduce otro numero");
//		num2 = Integer.parseInt(teclado.nextLine());
		System.out.println("¿Desea realizar una operacion(S/N)?");
		operacion = teclado.nextLine().charAt(0);
//		System.out.println("¿Que operacion quieres hacer(+,-,*,/)?");
//		opc = teclado.nextLine().charAt(0);
		
		while (operacion == 'S') {
			System.out.println("Introduce un numero");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce otro numero");
			num2 = Integer.parseInt(teclado.nextLine());
			System.out.println("¿Que operacion quieres hacer(+,-,*,/)?");
			opc = teclado.nextLine().charAt(0);
			
			switch (opc){
				case '+':
				{
					resultado = num1+num2;
					break;
				}
				case '-':
				{
					resultado = num1-num2;
					break;
				}
				case '*':
				{
					resultado = num1*num2;
					break;
				}
				case '/':
				{
					if (num2 == 0) {
						error = true;
					}
					else {
						resultado = num1/num2;
					}
					break;
				}
				default:
					error = true;
			}
			if (error == true) {
				System.out.println("Ha ocurrido un error");
			}
			else {
				System.out.println("El resultado es " + resultado);
			}
			System.out.println("¿Desea realizar una operacion(S/N)?");
			operacion = teclado.nextLine().charAt(0);
		}
		
		
		
		
		
//		if (opc == '+') {
//			resultado = num1 + num2;
//		}
//		else if (opc == '-') {
//			resultado = num1 - num2;
//		}
//		else if (opc == '*') {
//			resultado = num1 * num2;
//		}
//		else if (opc == '/') {
//			resultado = num1 / num2;
//		}
//		else {
//			System.out.println("Error");
//		}
//		System.out.println("El resultado es " + resultado);
		
		
	}
	
	

}
