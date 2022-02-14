import java.util.Objects;

public class Cuenta {
	
	private double saldo;
	private int nIngresos;
	private int nReintegros;
	private String ncc;
	
	public Cuenta(String ncc,double saldo) {
		super();
		this.ncc = ncc;
		if (saldo  < 0) {
			this.saldo = 0;
		}
		else {
			this.saldo = saldo;
		}
		this.nIngresos = 0;
		this.nReintegros = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNcc() {
		return ncc;
	}

	public int getnIngresos() {
		return nIngresos;
	}

	public int getnReintegros() {
		return nReintegros;
	}
	
	public boolean ingresar(double cantidad) {
		boolean resultado = false;
		if (cantidad > 0) {
			resultado = true;
			this.saldo += cantidad;
			this.nIngresos += 1;
		}
		return resultado;
	}
	
	public boolean reintegro(double cantidad) {
		boolean resultado = false;
		if (cantidad < this.saldo && cantidad > 0) {
			resultado = true;
			this.saldo -= cantidad;
			this.nReintegros += 1;
		}
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ncc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(ncc, other.ncc);
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", nIngresos=" + nIngresos + ", nReintegros=" + nReintegros + ", ncc=" + ncc
				+ "]";
	}

	
	
	
	
	
	
	
}
