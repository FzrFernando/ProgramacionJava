package com.jacaranda;

import java.util.Objects;

public class Personaje {
	
	private String nombre;
	private int poder;
	private Pelicula primeraPelicula;
	private double estatura;
	private double peso;
	private String especie;
	
	public Personaje(String nombre, double estatura, double peso, String especie) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}

	public Personaje(String nombre, int poder, Pelicula primeraPelicula, double estatura, double peso, String especie) {
		super();
		this.nombre = nombre;
		this.poder = poder;
		this.primeraPelicula = primeraPelicula;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}

	public Pelicula getPrimeraPelicula() {
		return primeraPelicula;
	}

	public void setPrimeraPelicula(Pelicula primeraPelicula) {
		this.primeraPelicula = primeraPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPoder() {
		return poder;
	}

	public double getEstatura() {
		return estatura;
	}

	public double getPeso() {
		return peso;
	}

	public String getEspecie() {
		return especie;
	}

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
