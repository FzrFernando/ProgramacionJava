import java.util.Objects;

public class Rectangulo {

	private double longitud;
	private double ancho;
	
	
	public Rectangulo() {
		super();
		this.longitud = 1;
		this.ancho = 1;
	}


	public double getLongitud() {
		return longitud;
	}


	public boolean setLongitud(double longitud) {
		if (longitud > 0 && longitud < 20) {
			this.longitud = longitud;
			return true;
		}
		else {
			return false;
		}
	}


	public double getAncho() {
		return ancho;
	}


	public boolean setAncho(double ancho) {
		if (ancho > 0 && ancho < 20) {
			this.ancho = ancho;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double perimetro() {
		double perimetro = 0;
		if (setLongitud(longitud) == true && setAncho(ancho) == true) {
			perimetro = this.longitud * 2 + this.ancho * 2;
		}
		return perimetro;
	}
	
	public double area() {
		double area=0;
		if (setLongitud(longitud) == true && setAncho(ancho) == true) {
			area = this.longitud * this.ancho;
		}
		return area;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ancho, longitud);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}


	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}
	
	
	
}
