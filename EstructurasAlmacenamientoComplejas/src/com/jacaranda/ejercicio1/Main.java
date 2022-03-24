package com.jacaranda.ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a = new Alumno("Fer","1651");
		Alumno b = new Alumno("Zari","161");
		
		Equipo e = new Equipo("ZariEquipo");
		
		try {
			e.addAlumno(a);
			System.out.println("Alumno Añadido");
			System.out.println(e);
			/*e.borrarAlumno(a);
			System.out.println("Alumno Borrado");
			System.out.println(e);*/
			System.out.println(e.contenerAlumno(a));
			System.out.println("Contiene alumno");
		} catch (EquipoException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
