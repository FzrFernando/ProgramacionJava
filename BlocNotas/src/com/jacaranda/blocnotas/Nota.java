package com.jacaranda.blocnotas;

import java.time.LocalDateTime;
import java.util.Objects;

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
	
	public boolean isCreadoAnterior(Nota n1) {
		boolean creadoAnterior = false;
		if (this.fechaCreacion.isBefore(n1.fechaCreacion)) {
			creadoAnterior = true;
		}
		return creadoAnterior;
	}
	
	public boolean isModificadoAnterior(Nota n1) {
		boolean modificadoAnterior = false;
		if (this.fechaUltimaModificacion.isBefore(n1.fechaUltimaModificacion)) {
			modificadoAnterior = true;
		}
		return modificadoAnterior;
	}


	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return "Nota [codigo=" + codigo + ", texto=" + texto + ", fechaCreacion=" + fechaCreacion
				+ ", fechaUltimaModificacion=" + fechaUltimaModificacion + "]";
	}
	
	
}
