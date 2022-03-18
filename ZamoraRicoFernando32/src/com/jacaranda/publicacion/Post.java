package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Post extends Publicacion{

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario usuario, String tema) throws PublicacionException {
		super(texto, usuario);
		// TODO Auto-generated constructor stub
		if (texto.equals(null) || usuario == null || tema.equals(null)) {
			throw new PublicacionException("No puede haber valores nulos");
		}
		this.tema = tema;
		this.numeroLecturas=0;
	}

	@Override
	protected void setTexto(String texto) {
		// TODO Auto-generated method stub
		this.texto = texto;
	}

	@Override
	public boolean valorar(String valoracion) {
		// TODO Auto-generated method stub
		super.valoracion = super.getValoracion();
		this.numeroLecturas++;
		return super.valorar(valoracion);
	}
	
	public String toString() {
		return "Post." + "\n"
				+ super.toString();
	}
}
