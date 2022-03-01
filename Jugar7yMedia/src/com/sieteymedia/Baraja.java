package com.sieteymedia;
import java.util.Arrays;
import java.util.Random;

public class Baraja {
	Random claseRandom = new Random();
	private static final int NUMCARTAS=40;
	private int siguiente;
	private Carta []cartas;
	
	public Baraja() {
		super();
		this.cartas = new Carta[NUMCARTAS];
		this.siguiente = 0;
	}
	
	public void barajar() throws CartaException {
		this.cartas = new Carta[NUMCARTAS];
		
		int i = 0;
		while (i < NUMCARTAS) {
			Carta c = new Carta(generarNumero(), generarPalo());
			boolean encontrado = false;
			for (int j = 0; j < i && !false; j++) {
				if (cartas[j].equals(c)) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				cartas[i] = c;
				i++;
			}
		}
	}

	public Carta getSiguiente() throws CartaException {
		Carta resultado = new Carta(cartas[siguiente].getNumber(),cartas[siguiente].getPalo());
		siguiente++;
		return resultado;
	}
	
	private String generarPalo() {
		String palo="";
		int numPalo = claseRandom.nextInt(3);
		if (numPalo == 0) {
			palo = "Espada";
		}
		if (numPalo == 1) {
			palo = "Oro";
		}
		if (numPalo == 2) {
			palo = "Bastos";
		}
		if (numPalo == 3) {
			palo = "Copa";
		}
		return palo;
	}
	
	private int generarNumero() {
		int numero;
		numero = 1 + claseRandom.nextInt(10-1);
		return numero;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < NUMCARTAS; i++) {
			resultado.append(cartas[i].toString() + "\n");
		}
		return resultado.toString();
	}
	
	
}
