package com.jacaranda.blocnotas;

import java.time.LocalDateTime;

public class Nota {

	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) {
		super();
		this.texto = texto;
		codigo = codigoSiguiente++;
		fechaCreacion = LocalDateTime.now();
		fechaUltimaModificacion = LocalDateTime.now();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion = LocalDateTime.now();
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean modificado = false;
		if (this.fechaUltimaModificacion.isAfter(fechaCreacion)) {
			modificado = true;
		}
		return modificado;
	}
	
	public boolean isEmpty() {
		boolean vacio = false;
		if (this.texto.equals("")) {
			vacio = true;  
		}
		return vacio;
	}
}
