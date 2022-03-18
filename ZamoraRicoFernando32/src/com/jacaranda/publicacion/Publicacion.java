package com.jacaranda.publicacion;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Objects;

import com.jacaranda.usuario.Usuario;

public abstract class Publicacion implements Valorable, Comparable <Publicacion>{
	
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	private Usuario usuario;
	private Valoraciones valoraciones;

	public Publicacion(String texto, Usuario usuario) {
		super();
		this.texto = texto;
		this.usuario = usuario;
		this.codigo=codigoSiguiente++;
		this.fechaCreacion = LocalDateTime.now();
	}

	protected String getTexto() {
		return texto;
	}

	protected abstract void setTexto(String texto);

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
		Publicacion other = (Publicacion) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}
	
	public boolean valorar(String valoracion) {
		boolean result = false;
		if (valoracion.equals(Valoraciones.valueOf(valoracion.toUpperCase()))) {
			result = true;
			this.valoracion += valoraciones.getValoraciones();
		}
		return result;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Publicacion: " + texto + "\n" + 
				"Realizada por: " + usuario.getLogin() + "\n" +
				"Valoracion: " + valoracion + "\n" +
				"Fecha de publicación: " + fechaCreacion;
	}

	@Override
	public int compareTo(Publicacion o) {
		int resultado = 0;
		if (o == null) {
			resultado = -1;
		}
		else {
			resultado = this.texto.compareTo(o.texto);
			if (resultado == 0) {
				resultado = this.getFechaCreacion().compareTo(o.getFechaCreacion());
			}
		}
		return resultado;
	}

	public boolean isAnterior(Publicacion p1) throws PublicacionException {
		if (p1 == null) {
			throw new PublicacionException("Error");
		}
		return this.fechaCreacion.isBefore(p1.fechaCreacion);
	}
	
	
}
