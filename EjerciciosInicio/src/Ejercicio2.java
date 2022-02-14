import java.util.Scanner;

public class Ejercicio2 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char dia;
		
		System.out.println("Dime un día de la semana(L/M/X/J/V)");
		dia = teclado.nextLine().charAt(0);
		
		switch (dia) 
		{
			case 'L':
				{
				System.out.println("La asignatura que toca es Entorno");
				break;
				}
			case 'M':
				{
				System.out.println("La asignatura que toca es Programacion");
				break;
				}
			case 'X':
				{
				System.out.println("La asignatura que toca es FOL");
				break;
				}
			case 'J':
				{
				System.out.println("La asignatura que toca es Sistemas Informaticos");
				break;
				}
			case 'V':
				{
				System.out.println("La asignatura que toca es Programacion");
				break;
				}
			default:
				System.out.println("Has introducido un dia incorrecto");
		}
		
	}

}
