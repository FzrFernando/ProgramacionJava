package com.vinos;

public class Plato {

	/**
	 * Aquí se mostrarán los atributos de la clase
	 */
	private String nombre;
	private double precio;
	private static final double IVA = 0.21;
	private Vino vino;
	
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
		precioConIva = this.precio * this.IVA;
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
	
	
}
