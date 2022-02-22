package com.vinos;

import java.util.Scanner;

public class MainVinos {

	public static Scanner teclado = new Scanner (System.in);
	static final int MAX_PLATO = 3;
	static int indiceArrayPlato = 0;
	static Plato [] plato = new Plato[MAX_PLATO];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Bienvenidos al menú del Restaurante Los Pacos");
		System.out.println("Que opción quiere escoger:" + "\n" +
							"1. Dar de alta un plato" + "\n" +
							"2. Modificar el precio de un plato" + "\n" +
							"3. Asignar un vino a un plato" + "\n" +
							"4. Mostrar información de un plato" + "\n" +
							"5. Mostrar información de todos los platos" + "\n" +
							"6. Salir");
		
		int opc;
		opc = Integer.parseInt(teclado.nextLine());
		
		while(opc != 6) {
			switch (opc) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				for (int i = 0; i < plato.length; i++) {
					plato[i].toString();
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
