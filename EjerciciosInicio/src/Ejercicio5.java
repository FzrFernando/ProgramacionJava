import java.util.Scanner;

//Realiza un método que reciba una hora por parámetro y que muestre luego buenos días, 
//buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, 
//de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas.
public class Ejercicio5 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora = leerHora("Introduce una hora");
		
		System.out.println(saludoHora(hora));
		
	}
	
	public static int leerHora(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}

	public static String saludoHora(int horaIntroducida) {
		String mensaje;
		if (horaIntroducida >= 6 && horaIntroducida <= 12) {
			mensaje = "Buenos dias";
		}
		else if (horaIntroducida <= 20) {
			mensaje = "Buenas tardes";
		}
		else {
			mensaje = "Buenas noches";
		}
		return mensaje;
	}
}
