package com.jacaranda.nota;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota extends NotaAlarmaException implements Comparable <Nota>{

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
		fechaUltimaModificacion = fechaCreacion;
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

	public LocalDateTime getFechaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean modificado = false;
		if (this.fechaUltimaModificacion == null) {
			modificado = true;
		}
		else {
			modificado = this.fechaCreacion.equals(this.fechaUltimaModificacion);
		}
		return modificado;
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota n1) throws NotaAlarmaException {
		if (n1 == null) {
			throw new NotaAlarmaException("Error");
		}
		 return this.fechaCreacion.isBefore(n1.fechaCreacion);
		
	}
	
	public boolean isModificadoAnterior(Nota n1) throws NotaAlarmaException {
		if (n1 == null) {
			throw new NotaAlarmaException("Error");
		}
		 return this.fechaUltimaModificacion.isBefore(n1.fechaUltimaModificacion);
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

	@Override
	public int compareTo(Nota o) {
		// TODO Auto-generated method stub
		int resultado;
		if (o == null) {
			resultado = -1;
		}
		else{
			resultado = this.texto.compareTo(o.texto);
			if (resultado == 0) {
				resultado = this.getFechaCreacion().compareTo(o.getFechaCreacion());
			}
		}
		return resultado;
	}
	
}
