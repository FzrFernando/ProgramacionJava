package com.jacaranda.ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
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
		if (listado.contains(alumno) || alumno == null) {
			throw new EquipoException("Alumno ya existente o nulo");
		}
		listado.add(alumno);
	}

	public void addAlumno2(Alumno alumno) throws EquipoException {
		if (!listado.add(alumno) || alumno == null) {
			throw new EquipoException("Alumno ya existente o nulo");
		}
	}

	public void borrarAlumno(Alumno alumno) throws EquipoException {
		if (!listado.remove(alumno) || alumno == null) {
			throw new EquipoException("No se ha encontrado el alumno o nulo");
		}
	}

	public Alumno contenerAlumno(Alumno alumno) throws EquipoException {
		Alumno aux = null;
		if (alumno == null) {
			throw new EquipoException("Es nulo");
		}
		if (listado.contains(alumno) == true) {
			aux = alumno;
		}
		return aux;
	}

	public void delAlumno(String nombre) {
		Iterator<Alumno> siguiente = this.listado.iterator();
		while (siguiente.hasNext()) {
			Alumno a = siguiente.next();
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				this.listado.remove(a);
			}
		}

	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listado=" + listado + "]";
	}

	public int numAlumnos() {
		return this.listado.size();
	}

//	public Equipo unionEquipo(Equipo e2) {
//		Equipo resultado = new Equipo("");
//		for (Alumno a: this.listado) {
//			if (e2.listado.contains(a)) {
//				
//			}
//		}
//	}
}
