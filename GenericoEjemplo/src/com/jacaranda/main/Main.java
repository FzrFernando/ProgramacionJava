package com.jacaranda.main;

import java.util.Arrays;

import com.jacaranda.utilidades.Utilidades;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] origen = { "Luis", "Pepe", "Lola" };

		String[] destino = new String[7];
		
		Integer[] array1Int = { 10, 20, 30 };
		
		Integer[] array2Int = new Integer[7];
		
		
		Utilidades.volcarArray(origen, destino);
		
		Utilidades.volcarArray(array1Int, array2Int);
		
		
		System.out.println("Array string origen " + Utilidades.toString(origen));
		
		System.out.println("Array sting destino " + Utilidades.toString(destino));
		
		System.out.println("Array Integer origen " + Utilidades.toString(array1Int));
		
		System.out.println("Array Integer destino " + Utilidades.toString(array2Int));
	}

}
