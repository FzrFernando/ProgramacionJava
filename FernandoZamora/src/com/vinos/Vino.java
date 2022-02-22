package com.vinos;

import java.util.Objects;

public class Vino {

	/**
	 * Aquí se mostrarán los atributos de la clase
	 */
	private String nombre; //String con el nombre que tendrá el vino
	private double graduacion; //Double con la graduacion del vino
	
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Vino(String nombre, double graduacion) throws VinoException {
		super();
		this.nombre = nombre;
		if (graduacion < 0) {
			throw new VinoException("La graduacion debe ser mayor que 0");
		}else {
			this.graduacion = graduacion;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
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
		Vino other = (Vino) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Vino [nombre=" + nombre + ", graduacion=" + graduacion + "]";
	}
	
	
}
