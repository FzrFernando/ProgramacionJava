package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Tweet extends Publicacion{

	public Tweet(String texto, Usuario usuario) throws PublicacionException {
		super(texto, usuario);
		// TODO Auto-generated constructor stub
		if (texto.length() > 50) {
			throw new PublicacionException("Tiene un máximo de 50 caracteres");
		}
	}

	@Override
	protected void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public boolean valorar(String valoracion) {
		// TODO Auto-generated method stub
		super.valoracion = super.getValoracion()*2;
		return super.valorar(valoracion);
	}

	@Override
	public String toString() {
		return "Tweet." + "\n"
				+ super.toString();
	}

	
}
