package com.jacaranda.main;

import com.jacaranda.publicacion.PublicacionException;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;

public class Main {

	public static void main(String[] args) throws PublicacionException {
		// TODO Auto-generated method stub
		
		Usuario u1 = new Usuario("Ferzari","pass");
				
		Tweet t1 = new Tweet("La palabra del Worldle es HURTO", u1);
		System.out.println(t1.toString());
	}

}
