package com.jacaranda.nota;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private static final int MINUTOSREPETIRPORDEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;


	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) throws NotaAlarmaException {
		super(texto);
		setFechaAlarma(fechaAlarma);
		this.activado = activado;
		this.minutosRepetir = NotaAlarma.MINUTOSREPETIRPORDEFECTO;
	}

	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) throws NotaAlarmaException {
		super(texto);
		setFechaAlarma(fechaAlarma);
		this.minutosRepetir = minutosRepetir;
		this.activado = true;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) throws NotaAlarmaException {
		if(fechaAlarma == null) {
			throw new NotaAlarmaException("Error");
		}
		if (fechaAlarma.isBefore(this.getFechaCreacion())) {
			throw new NotaAlarmaException("Error");
		}
		this.fechaAlarma = fechaAlarma;
	}
	
	public static int getMINUTOSREPETIRPORDEFECTO() {
		return MINUTOSREPETIRPORDEFECTO;
	}

	@Override
	public void activar() {
		// TODO Auto-generated method stub
		this.activado = true;
	}

	@Override
	public void desactivar() {
		// TODO Auto-generated method stub
		this.activado = false;
	}
	
	public boolean isActivado() {
		return activado;
	}

	@Override
	public String toString() {
		return super.toString() + "NotaAlarma [fechaAlarma=" + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}

}
