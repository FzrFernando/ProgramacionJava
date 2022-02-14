import java.util.Objects;

public class NumerosComplejo {

	private double parteReal;
	private double parteImaginaria;
	
	public NumerosComplejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public NumerosComplejo() {
		super();
		this.parteReal = 0;
		this.parteImaginaria = 0;
	}
	
	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	public NumerosComplejo sumaComplejos(NumerosComplejo sumando) {
		NumerosComplejo resultado = new NumerosComplejo(0,0);
		resultado.parteReal = this.parteReal + sumando.parteReal;
		resultado.parteImaginaria = this.parteImaginaria + sumando.parteImaginaria;
		
		return resultado;
	}

	public NumerosComplejo restaComplejos(NumerosComplejo restando) {
		NumerosComplejo resultado = new NumerosComplejo(0,0);
		resultado.parteReal = this.parteReal - restando.parteReal;
		resultado.parteImaginaria = this.parteImaginaria - restando.parteImaginaria;
		
		return resultado;
	}

	@Override
	public String toString() {
		return "(" + parteReal + ", " + parteImaginaria + "i)";
	}

	@Override
	public int hashCode() {
		return Objects.hash(parteImaginaria, parteReal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumerosComplejo other = (NumerosComplejo) obj;
		return Double.doubleToLongBits(parteImaginaria) == Double.doubleToLongBits(other.parteImaginaria)
				&& Double.doubleToLongBits(parteReal) == Double.doubleToLongBits(other.parteReal);
	}

}
