package com.vinos;

import java.util.Scanner;

public class MainVinos {

	public static Scanner teclado = new Scanner (System.in);
	static final int MAX_PLATO = 3;
	static int indiceArrayPlato = 0;
	static Plato [] plato = new Plato[MAX_PLATO];
	
	public static void main(String[] args) throws PlatoException, VinoException {
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
					boolean encontrado = false;
					System.out.println("Nombre del plato para dar de alta");
					String nombre;
					nombre = teclado.nextLine();
					System.out.println("Precio del plato para dar de alta");
					double precio;
					precio = Double.parseDouble(teclado.nextLine());
					for (int i = 0; i < plato.length && encontrado==false; i++) {
						if (plato[i].getNombre().equals(nombre)) {
							encontrado = true;
						}
					}
					if (encontrado == false) {
						plato[indiceArrayPlato] =  new Plato(nombre, precio);
						indiceArrayPlato++;
					}
					break;
				}
				case 2: {
					boolean encontrado = false;
					System.out.println("Nombre del plato para cambiarle el precio");
					String nombre;
					nombre = teclado.nextLine();
					Plato p1 = new Plato(nombre);
					for (int i = 0; i < plato.length; i++) {
						if (plato[i].getNombre().equals(nombre)) {
							encontrado = true;
						}
					}
					if (encontrado == true) {
						double precioModificado;
						System.out.println("Dime cuanto quieres incrementar el precio");
						precioModificado = Double.parseDouble(teclado.nextLine());
						p1.incrementaPrecio(precioModificado);
					}
					break;
				}
				case 3: {
					break;
				}
				case 4: {
					String platoPedido;
					System.out.println("De que plato quiere informacion");
					platoPedido = teclado.nextLine();
					for (int i = 0; i < plato.length; i++) {
						try {
							if (plato[i].getNombre().equals(platoPedido)) {
								plato[i].toString();
							}
						} catch (Exception e) {
							e.getMessage();
						}
					}
					break;
				}
				case 5: {
					for (int i = 0; i < plato.length; i++) {
						plato[i].toString();
					}
					break;
				}
			}
		}	
		
	}

}
