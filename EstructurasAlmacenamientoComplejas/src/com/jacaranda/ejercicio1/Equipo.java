package com.jacaranda.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

	private String nombre;
	private Set<Alumno> listado;
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.listado = new HashSet<Alumno>();
	}
	
	public void addAlumno(Alumno alumno) throws EquipoException {
		if (listado.contains(alumno)) {
			throw new EquipoException("Alumno ya existente");
		}
		listado.add(alumno);
	}
}
