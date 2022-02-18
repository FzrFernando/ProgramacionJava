package com.jacaranda;

/**
 * 
 * @author Fernando Zamora Rico
 *
 *
 */

public class Pelicula {

	/**
	 * 
	 * nombre nombre de la pelicula
	 * estreno fecha(en integer) del estreno
	 * personajes array de personajes
	 */
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
	
	
	/**
	 * getNombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * getEstreno
	 * @return
	 */
	public int getEstreno() {
		return estreno;
	}
	
	/**
	 * getPersonaje
	 * @return devuelve el array de personajes
	 */
	public Personaje[] getPersonajes() {
		return personajes;
	}

	/**
	 * 
	 * @param pelicula
	 * @return devuelve un boolean para ver cual peli es mas nueva
	 */
	public boolean masNueva(Pelicula pelicula) {
		boolean nueva = false;
		if (this.estreno < pelicula.estreno) {
			nueva = true;
		}
		return nueva;
	}
}
