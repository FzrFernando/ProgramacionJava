package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Recomendacion extends Publicacion{

	private int numeroEstrellas;

	
	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) throws PublicacionException {
		super(texto, usuario);
		// TODO Auto-generated constructor stub
		if ((texto.length()<100 || texto.length()>200) && (numeroEstrellas < 1 || numeroEstrellas > 5)) {
			throw new PublicacionException("El texto puede ser entre 100 y 200 caracteres y una recomendacion entre 1 y 5 estrellas");
		}
		this.numeroEstrellas = numeroEstrellas;
	}

	@Override
	protected void setTexto(String texto) {
		// TODO Auto-generated method stub
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Recomendacion" + "\n" + 
				super.toString() + "\n" + 
				"Número de estrellas:" + numeroEstrellas;
	}

	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}
	
	
}
