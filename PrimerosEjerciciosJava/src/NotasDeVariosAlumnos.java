import java.util.Scanner;

public class NotasDeVariosAlumnos {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notasPracticas,notasProblemas,notasExamenes;
		char opc;
		
		do  {
			System.out.println("Dime tu nota practica");
			notasPracticas = Double.parseDouble(teclado.nextLine());
			System.out.println("Dime tu nota de los problemas");
			notasProblemas = Double.parseDouble(teclado.nextLine());
			System.out.println("Dime tu nota de los examenes");
			notasExamenes = Double.parseDouble(teclado.nextLine());
			System.out.println(media(notasPracticas,notasProblemas,notasExamenes));
			System.out.println("¿Desea introducir mas notas?(S/N)");
			opc = teclado.nextLine().charAt(0);
		} while (opc == 'S' || opc == 's');
	}
	
	public static double media(double notasPracticas, double notasProblemas, double notasExamenes) {
		double resultado= 0.1*notasPracticas + 0.5*notasExamenes + 0.4*notasProblemas;
		return resultado;
	}
	

}
