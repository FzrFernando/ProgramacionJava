package com.jacaranda.bloc;

import java.util.Arrays;
import java.util.Objects;

import com.jacaranda.nota.Nota;
import com.jacaranda.nota.NotaAlarma;

public class Bloc extends BlocException {

	private static final int NUMERONOTASMAXIMA=3;
	private int numNotas;
	private String nombre;
	private Nota[] nota;
	
	public Bloc(String nombre) throws BlocException{
		super();
		this.nombre = nombre;
		this.numNotas = 0;
		this.nota = new Nota[NUMERONOTASMAXIMA];
	}

	private void compruebaExisteNota(int pos) throws Exception{
		if (pos >= this.numNotas) {
			throw new Exception("Error");
		}
	}
	
	public String getNota(int numNotas) {
		return nota[numNotas].getTexto();
	}

	public void updateNota(int pos, String texto) {
		nota[pos].setTexto(texto);
	}
	
	public void activa(int pos) throws Exception {
		compruebaExisteNota(pos);
		if (nota[pos] instanceof NotaAlarma) {
			((NotaAlarma) nota[pos]).activar();
		}
		else {
			throw new BlocException();
		}		
	}
	
	public void desactiva(int pos) throws Exception {
		compruebaExisteNota(pos);
		if (nota[pos] instanceof NotaAlarma) {
			((NotaAlarma) nota[pos]).desactivar();
		}
		else {
			throw new BlocException();
		}		
	}
	
	public static int getNumeronotasmaxima() {
		return NUMERONOTASMAXIMA;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloc other = (Bloc) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + "]";
	}
	
	public String ordenaBloc() {
		Nota[] blocOrdenado = new Nota [numNotas];
		for (int i = 0; i < this.numNotas;i++) {
			//blocOrdenado[i] = this.nota[i].clone();
		}
		Arrays.sort(blocOrdenado);
		return blocOrdenado.toString();
	}
}
