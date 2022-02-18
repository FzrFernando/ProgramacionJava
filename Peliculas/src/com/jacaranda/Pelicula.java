package com.jacaranda;

/**
 * 
 * @author Fernando
 *
 *
 */

public class Pelicula {

	private String nombre;
	private int estreno;
	private Personaje personajes[] = new Personaje[3];
	
	
	/**
	 * 
	 * @param nombre nombre de la pelicula
	 * @param estreno fecha(en integer) del estreno
	 * @param personajes array de personajes
	 */
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
	
	public Personaje[] getPersonajes() {
		return personajes;
	}

	public boolean masNueva(Pelicula pelicula) {
		boolean nueva = false;
		if (this.estreno < pelicula.estreno) {
			nueva = true;
		}
		return nueva;
	}
}
