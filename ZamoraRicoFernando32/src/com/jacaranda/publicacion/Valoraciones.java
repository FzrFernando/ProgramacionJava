package com.jacaranda.publicacion;

public enum Valoraciones {
	SUPERBUENA(3),MUYBUENA(2),BUENA(1),NORMAL(0),REGULAR(-1),MUYMALA(-2);

	private int valoraciones;

	private Valoraciones(int valoraciones) {
		this.valoraciones = valoraciones;
	}

	public int getValoraciones() {
		return valoraciones;
	}
	
}