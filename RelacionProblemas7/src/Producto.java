import java.util.Objects;

public class Producto {

	private int codigo;
	private String descripcion;
	private double precio;
	private static final double IVA = 0.2;
	private static int codsiguiente;
	
	
	public Producto(double precio, String descripcion) throws ProductoException {
		super();
		this.codigo = codsiguiente;
		this.descripcion = descripcion;
		this.setPrecio(precio);
		codsiguiente++;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) throws ProductoException{
		if (precio <= 0) {
			throw new ProductoException("Introduce un precio en condiciones primo");
		}
		this.precio = precio;
	}
	
	public double calcularPrecioConIva() {
		double preciofinal = 0;
		preciofinal = precio + (precio*IVA);
		return preciofinal;
	}
	
	public static double getIva() {
		return IVA*100;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
