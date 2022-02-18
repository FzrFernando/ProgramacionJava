package com.jacaranda;

public class Pelicula {

	private String nombre;
	private int estreno;
	private Personaje personaje1;
	private Personaje personaje2;
	private Personaje personaje3;
	
	public Pelicula(String nombre, int estreno, Personaje personaje1, Personaje personaje2, Personaje personaje3) {
		super();
		this.nombre = nombre;
		this.estreno = estreno;
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;
		this.personaje3 = personaje3;
	}

	public Personaje getPersonaje1() {
		return personaje1;
	}

	public void setPersonaje1(Personaje personaje1) {
		this.personaje1 = personaje1;
	}

	public Personaje getPersonaje2() {
		return personaje2;
	}

	public void setPersonaje2(Personaje personaje2) {
		this.personaje2 = personaje2;
	}

	public Personaje getPersonaje3() {
		return personaje3;
	}

	public void setPersonaje3(Personaje personaje3) {
		this.personaje3 = personaje3;
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
