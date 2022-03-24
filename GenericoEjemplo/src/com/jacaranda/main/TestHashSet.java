package com.jacaranda.main;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ciudades = new HashSet<String>();
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Sevilla");
		ciudades.add("Madrid"); // repetido

		Iterator<String> iterador = ciudades.iterator();
		while (iterador.hasNext())
			System.out.println("Ciudad: " + iterador.next());

		// Equivalente a lo anterior
		for (String c : ciudades) {
			System.out.println("Ciudad " + c);
		}
	}

}
