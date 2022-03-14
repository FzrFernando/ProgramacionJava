package com.jacaranda.nota;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private static final int MINUTOSREPETIRPORDEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;
	
	
	public NotaAlarma(String texto) {
		super(texto);
		// TODO Auto-generated constructor stub
		this.fechaAlarma = LocalDateTime.now();
		this.activado = false;
	}


	@Override
	public void activar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void desactivar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
