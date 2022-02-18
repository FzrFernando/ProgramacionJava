package com.jacaranda;

import java.util.Objects;

/**
 * 
 * @author Fernando Zamora Rico
 *
 */

public class Personaje {
	
	/**
	 * 
	 * nombre nombre que le vamos a dar a nuestro personaje
	 * poder poder que va a tener el personaje
	 * primeraPelicula pelicula tipo pelicula donde aparece el personaje
	 * estatura estatura que tendrá el personaje
	 * peso peso que tendrá el personaje
	 * especie como será nuestro personaje(humano, alienigena, etc...)
	 * 
	 */
	
	private String nombre;
	private int poder;
	private Pelicula primeraPelicula;
	private double estatura;
	private double peso;
	private String especie;
	
	
	/**
	 * 
	 * @param nombre nombre que le vamos a dar a nuestro personaje
	 * @param estatura estatura que tendrá el personaje
	 * @param peso peso que tendrá el personaje
	 * @param especie como será nuestro personaje(humano, alienigena, etc...)
	 */
	public Personaje(String nombre, double estatura, double peso, String especie) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}

	/**
	 * 
	 * @param nombre nombre que le vamos a dar a nuestro personaje
	 * @param poder poder que va a tener el personaje
	 * @param primeraPelicula pelicula tipo pelicula donde aparece el personaje
	 * @param estatura estatura que tendrá el personaje
	 * @param peso peso que tendrá el personaje
	 * @param especie como será nuestro personaje(humano, alienigena, etc...)
	 */
	
	public Personaje(String nombre, int poder, Pelicula primeraPelicula, double estatura, double peso, String especie) {
		super();
		this.nombre = nombre;
		this.poder = poder;
		this.primeraPelicula = primeraPelicula;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}

	/**
	 * 
	 * getPrimeraPelicula
	 * @return primerapelicula
	 */
	public Pelicula getPrimeraPelicula() {
		return primeraPelicula;
	}

	/**
	 * setPrimeraPelicula
	 * @param primeraPelicula
	 */
	public void setPrimeraPelicula(Pelicula primeraPelicula) {
		this.primeraPelicula = primeraPelicula;
	}

	/**
	 * getNombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * getPoder
	 * @return poder
	 */
	public int getPoder() {
		return poder;
	}

	/**
	 * getEstatura
	 * @return estatura
	 */
	public double getEstatura() {
		return estatura;
	}

	/**
	 * getPeso
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * getEspecie
	 * @return especie
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * 
	 * @param poder poder que tendrá la película
	 * @throws PersonajeException si hubiese poder menor que 1 o mayor que 100
	 */
	public void setPoder(int poder) throws PersonajeException {
		if (poder < 1 || poder > 100) {
			throw new PersonajeException ("Error en el poder");
		}
		this.poder = poder;
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
		Personaje other = (Personaje) obj;
		return Objects.equals(nombre, other.nombre);
	}

	/**
	 * metodo toString con la pequeña modificacion de que si el poder es mayor que el peso se poner antes el poder
	 * e igualmente se haría al revés
	 */
	@Override
	public String toString() {
		String cadenafinal="";
		if ((double) this.poder > this.peso) {
			cadenafinal = "nombre = " + nombre + ", estatura =" + estatura + ", especie =" + especie + ", poder =" + poder + ", peso =" + peso;
		}
		else if((double) this.poder < this.peso) {
			cadenafinal = "nombre = " + nombre + ", estatura =" + estatura + ", especie =" + especie + ", peso =" + peso + ", poder =" + poder ;
		}
		else {
			cadenafinal = "nombre = " + nombre + ", estatura =" + estatura + ", especie =" + especie + ", poder =" + poder + ", peso =" + peso;
		}
		return cadenafinal;
	}
	
	
}
