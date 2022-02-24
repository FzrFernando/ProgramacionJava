package com.sieteymedia;

import java.util.Objects;

public class Carta {

	private int number;
	private String palo;
	
	public Carta(int number, String palo) throws CartaException{
		super();
		if (number < 1 || number >10) {
			throw new CartaException("El valor de la carta no vale");
		}
		this.number = number;
		if (palo != "Espada" || palo != "Oro" || palo != "Bastos" || palo != "Copa") {
			throw new CartaException("El palo de la carta no vale");
		}
		this.palo = palo;
	}
	
	public double getValor() {
		double valor = 0;
		if (this.number > 7 && this.number <= 10) {
			valor = 0.5;
		}
		else {
			valor = this.number;
		}
		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}

	public int getNumber() {
		return number;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		String stringFinal = null;
		if (this.number == 8){
			stringFinal = "Carta [number=" + "Sota" + ", palo=" + palo + "]";
		}
		else if (this.number == 9) {
			stringFinal = "Carta [number=" + "Caballo" + ", palo=" + palo + "]";
		}
		else if (this.number == 10) {
			stringFinal = "Carta [number=" + "Rey" + ", palo=" + palo + "]";
		}
		else {
			stringFinal = "Carta [number=" + this.number + ", palo=" + palo + "]";
		}
		return stringFinal;
	}
	
	
}
