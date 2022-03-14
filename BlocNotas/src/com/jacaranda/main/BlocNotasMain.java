package com.jacaranda.main;

import com.jacaranda.nota.Nota;
import com.jacaranda.nota.NotaAlarmaException;

public class BlocNotasMain {

	public static void main(String[] args) throws NotaAlarmaException {
		// TODO Auto-generated method stub

		Nota n1 = new Nota("pepe");
		System.out.println(n1.toString());
		Nota n2 = new Nota("jose");
		System.out.println(n2);
		if (n1.isCreadoAnterior(n2)) {
			System.out.println("Anterior");
		}
		if (n1.isCreadoAnterior(n1)) {
			System.out.println("Anterior");
		}
		if (n1.isCreadoAnterior(null)) {
			System.out.println("Anterior");
		}
		
	}

}
