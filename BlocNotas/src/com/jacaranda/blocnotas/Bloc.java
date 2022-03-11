package com.jacaranda.blocnotas;

public class Bloc {

	private static final int NUMERONOTASMAXIMA=3;
	private int numNotas;
	private String nombre;
	
	public Bloc(String nombre) throws BlocException{
		super();
		this.nombre = nombre;
		this.numNotas = NUMERONOTASMAXIMA;
	}
	
	
}
