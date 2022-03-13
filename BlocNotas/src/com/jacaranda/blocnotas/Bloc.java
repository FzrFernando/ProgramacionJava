package com.jacaranda.blocnotas;

import java.util.Objects;

public class Bloc {

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
