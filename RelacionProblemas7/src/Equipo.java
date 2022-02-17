import java.util.Objects;

public class Equipo {

	private String nombre;
	private String ciudad;
	private String estadio;
	private int partidosGanados= 0;
	
	
	public Equipo(String nombre, String ciudad, String estadio) {
		super();
		this.nombre = nombre.toUpperCase();
		this.ciudad = ciudad;
		this.estadio = estadio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(estadio, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(estadio, other.estadio) && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", estadio=" + estadio + "]";
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getEstadio() {
		return estadio;
	}


	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPartidosGanados() {
		return partidosGanados;
	}


	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados ++;
	}
	
	
}
