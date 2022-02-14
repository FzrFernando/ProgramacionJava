import java.util.Scanner;

public class MainMaquina {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dineroMonedero;
		System.out.println("Introduce el dinero del monedero");
		dineroMonedero = Double.parseDouble(teclado.nextLine());
		MaquinaCafe mc1 =  new MaquinaCafe(dineroMonedero);
		int dinero;
		System.out.println("Introduzca una opci�n" + "\n" + 
							"1. Servir caf� solo (1 euro)" + "\n" +
							"2. Servir leche (0,8 euros)" + "\n" + 
							"3. Servir caf� con leche (1,5 euros)" + "\n" + 
							"4. Consultar estado m�quina. Aparecen los datos de los dep�sitos y del monedero"  + "\n" +
							"5. Apagar m�quina y salir");
		char opc = teclado.nextLine().charAt(0);
		
		while (opc != '5') {
			switch (opc) {
				case '1': {
					System.out.println("Introduzca dinero");
					dinero = Integer.parseInt(teclado.nextLine());
					System.out.println(mc1.servir(1,dinero));
					break;
				}
				case '2': {
					System.out.println("Introduzca dinero");
					dinero = Integer.parseInt(teclado.nextLine());
					System.out.println(mc1.servir(2,dinero));
					break;
				}
				case '3': {
					System.out.println("Introduzca dinero");
					dinero = Integer.parseInt(teclado.nextLine());
					System.out.println(mc1.servir(3,dinero));
					break;
				}
				case '4': {
					System.out.println(mc1.toString());
					break;
				}
				default: {
					System.out.println("Introduce una opci�n que sea v�lida");
				}
			}
			System.out.println("Introduzca una opci�n" + "\n" + 
					"1. Servir caf� solo (1 euro)" + "\n" +
					"2. Servir leche (0,8 euros)" + "\n" + 
					"3. Servir caf� con leche (1,5 euros)" + "\n" + 
					"4. Consultar estado m�quina. Aparecen los datos de los dep�sitos y del monedero"  + "\n" +
					"5. Apagar m�quina y salir");
			opc = teclado.nextLine().charAt(0);
		}

		
	}

}
