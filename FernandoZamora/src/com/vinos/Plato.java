package com.vinos;

import java.util.Objects;

public class Plato {

	/**
	 * Aquí se mostrarán los atributos de la clase
	 */
	private String nombre; //String con el nombre que tendrá el plato
	private double precio; //Double con el precio del plato
	private static final double IVA = 0.21; //Atributo estático y final que será el IVA en double y que podremos modificar a nuestro gusto
	private Vino vino; //La clase plato recibe un atributo Vino vino
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		try {
			setPrecio(precio);
		} catch (PlatoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * El siguiente método será el getPrecioBase
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		double precioConIva;
		precioConIva = this.precio + this.precio * this.IVA;
		return precioConIva;
	}

	public void setPrecio(double precio) throws PlatoException{
		if (precio <= 0) {
			throw new PlatoException("El precio debe ser mayor");
		}else {
			this.precio = precio;
		}
	}

	public Vino getVino() {
		return vino;
	}
	
	public void incrementaPrecio(double incremento) {
		this.precio = getPrecio() + incremento;
	}

	/**
	 * El siguiente método será SetVinoRecomendado
	 * @param vino
	 */
	public void setVino(Vino vino) {
		this.vino = vino;
	}
	
	public void setVinoRecomendado(String vino, double graduacion) {
		try {
			Vino v1 = new Vino(vino, graduacion);
		} catch (VinoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double getGradosVinosRecomendado() {
		double gradosRecomendados;
		gradosRecomendados = this.vino.getGraduacion();
		return gradosRecomendados;
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
		Plato other = (Plato) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", precio=" + precio + ", getPrecioVentaPublico()=" + getPrecioVentaPublico()
				+ ", getVino()=" + getVino() + ", getGradosVinosRecomendado()=" + getGradosVinosRecomendado() + "]";
	}

	public static double getIva() {
		return IVA;
	}
	
	
}
