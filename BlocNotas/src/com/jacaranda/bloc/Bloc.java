package com.jacaranda.bloc;

import java.util.Objects;

import com.jacaranda.nota.Nota;

public class Bloc extends BlocException {

	private static final int NUMERONOTASMAXIMA=3;
	private int numNotas;
	private String nombre;
	private Nota[] nota;
	
	public Bloc(String nombre) throws BlocException{
		super();
		this.nombre = nombre;
		this.numNotas = 0;
		this.nota = new Nota[NUMERONOTASMAXIMA];
	}

	public Nota[] getNota() {
		return nota;
	}

	public void updateNota(int pos, String texto) {
		nota[pos].setTexto(texto);
	}
	
	public static int getNumeronotasmaxima() {
		return NUMERONOTASMAXIMA;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloc other = (Bloc) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + "]";
	}
	
	
}
