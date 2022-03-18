package com.jacaranda.memoryStorage;

import com.jacaranda.publicacion.Post;
import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.publicacion.PublicacionException;
import com.jacaranda.publicacion.Recomendacion;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;

public class MemoryStorage extends MemoryStorageException {

	private static final int NUM_MAXIMO_USUARIOS = 15;
	private static final int NUM_MAXIMO_PUBLICACIONES = 50;
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	private Publicacion[] publicaciones;
	private Usuario[] usuarios;
	
	public MemoryStorage() {
		super();
		this.numUsuariosActuales=0;
		this.numPublicacionesActuales=0;
		this.publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
		this.usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
	}
	
	private int posicionUsuario(String usuario) {
		int posicion = 0;
		for (int i = 0; i < this.numUsuariosActuales;i++) {
			if (usuario.equals(usuarios[i])) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public void addUsuario(String login,String pass) throws MemoryStorageException {
		if (numUsuariosActuales == NUM_MAXIMO_USUARIOS) {
			throw new MemoryStorageException("Todos los usuarios creados");
		}
		usuarios[numUsuariosActuales++] = new Usuario(login,pass);
	}
	
	public void addPublicacion(String texto, String usuario) throws MemoryStorageException, PublicacionException {
		if (numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			throw new MemoryStorageException("Todos las publicaciones creadas");
		}
		publicaciones[numPublicacionesActuales++] = new Tweet(texto,usuarios[this.posicionUsuario(usuario)]);
	}
	
	public void addPublicacion(String texto, String usuario, String tema) throws MemoryStorageException, PublicacionException {
		if (numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			throw new MemoryStorageException("Todos las publicaciones creadas");
		}
		publicaciones[numPublicacionesActuales++] = new Post(texto,usuarios[this.posicionUsuario(usuario)],tema);
	}
	
	public void addPublicacion(String texto, String usuario, int numeroEstrellas) throws MemoryStorageException, PublicacionException {
		if (numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			throw new MemoryStorageException("Todos las publicaciones creadas");
		}
		publicaciones[numPublicacionesActuales++] = new Recomendacion(texto,usuarios[this.posicionUsuario(usuario)],numeroEstrellas);
	}
	
	public String mostrarListaPublicaciones() {
		return publicaciones.toString();
	}
	
	public String mostrarTweets() {
		return Tweet.class.toString();
	}
	
	public String mostrarPosts() {
		return Post.class.toString();
	}
	
	public String mostrarRecomendacion() {
		return Recomendacion.class.toString();
	}
}
