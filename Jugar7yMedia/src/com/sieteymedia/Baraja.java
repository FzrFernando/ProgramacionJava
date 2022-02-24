package com.sieteymedia;
import java.util.Random;

public class Baraja {
	Random claseRandom = new Random();
	private static final int NUMCARTAS=40;
	private int siguiente;
	private Carta []cartas;
	
	public Baraja() {
		super();
		this.cartas = new Carta[NUMCARTAS];
	}
	
	public void barajar() {
		
	}

	public int getSiguiente() {
		return siguiente;
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
		numero = claseRandom.nextInt(10-1);
		return numero;
	}
}
