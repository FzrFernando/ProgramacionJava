package com.jacaranda;

public class Pelicula {

	private String nombre;
	private int estreno;
	private Personaje personajes[] = new Personaje[3];
	
	public Pelicula(String nombre, int estreno, Personaje personajes[]) {
		super();
		this.nombre = nombre;
		this.estreno = estreno;
		this.personajes = personajes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEstreno() {
		return estreno;
	}
	
	public boolean masNueva(Pelicula pelicula) {
		boolean nueva = false;
		
		return nueva;
	}
}
