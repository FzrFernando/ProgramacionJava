package com.jacaranda.ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a = new Alumno("Fer","1651");
		
		Equipo e = new Equipo("ZariEquipo");
		
		try {
			e.addAlumno(a);
			System.out.println("Alumno Añadido");
		} catch (EquipoException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
