package com.jacaranda.utilidades;

public class Utilidades {

	public static <T> void volcarArray(T[] origen, T[] destino) {
		// TODO Auto-generated method stub
		int tamaño = Math.min(origen.length, destino.length);
		
		for (int i=0; i < tamaño; i++) {
			destino[i]=origen[i];
		}
	}

	public static <P> String toString(P[] array) {
		StringBuilder resultado = new StringBuilder();
		for (int i=0; i < array.length; i++) {
			if (array[i] != null) {
				resultado.append(array[i].toString()+ " ");
			}
		}
		return resultado.toString();
	}
	
}
