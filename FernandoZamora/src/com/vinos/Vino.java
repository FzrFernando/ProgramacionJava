package com.vinos;

public class Vino {

	private String nombre;
	private double graduacion;
	
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
	
	
}
