package com.jacaranda.utilidades;

public class Utilidades {

	public static <T> void volcarArray(T[] origen, T[] destino) {
		// TODO Auto-generated method stub
		int tamaño = Math.min(origen.length, destino.length);
		
		for (int i=0; i < tamaño; i++) {
			destino[i]=origen[i];
		}
	}

}
