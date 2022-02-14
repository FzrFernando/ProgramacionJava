import java.util.Objects;

public class MaquinaCafe {

	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	private final double PRECIOCAFE=1;
	private final double PRECIOCAFECONLECHE=1.5;
	private final double PRECIOLECHE=0.8;
	
	public MaquinaCafe (double monedero) {
		super();
		if (monedero > 0) {
			this.monedero = monedero;
		}
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.depositoVasos = 80;
	}
	
	private String servirCafe(double dinero) {
		String cadenaMaquina;
		double cambio;
		if (dinero < PRECIOCAFE) {
			cadenaMaquina = "Tiene que introducir m�s dinero";
		}
		else if (depositoCafe == 0 || depositoVasos == 0) {
			cadenaMaquina = "No hay existencias";			
		}
		else if (dinero > (monedero - PRECIOCAFE)) {
			cadenaMaquina = "No hay cambio";
		}
		else {
			cambio = dinero  -PRECIOCAFE;
			cadenaMaquina = "El cambio es "+ cambio;
			depositoCafe--;
			depositoVasos--;
			monedero += PRECIOCAFE;
		}
		return cadenaMaquina;
	}
	
	private String servirLeche(double dinero) {
		String cadenaMaquina;
		double cambio;
		if (dinero < PRECIOLECHE) {
			cadenaMaquina = "Tiene que introducir m�s dinero";
		}
		else if(depositoLeche == 0 || depositoVasos == 0) {
			cadenaMaquina = "No hay existencias";			
		}
		else if (dinero > (monedero-PRECIOLECHE)) {
			cadenaMaquina = "No hay cambio";
		}
		else {
			cambio = dinero - PRECIOLECHE;
			cadenaMaquina = "El cambio es "+cambio;
			depositoLeche--;
			depositoVasos--;
			monedero += PRECIOLECHE;
		}
		return cadenaMaquina;
	}
	
	private String servirCafeConLeche(double dinero) {
		String cadenaMaquina;
		double cambio;
		if (dinero < PRECIOCAFECONLECHE) {
			cadenaMaquina = "Tiene que introducir m�s dinero";
		}
		else if(depositoCafe == 0 || depositoLeche == 0 || depositoVasos == 0) {
			cadenaMaquina = "No hay existencias";			
		}
		else if (dinero > (monedero-PRECIOCAFECONLECHE)) {
			cadenaMaquina = "No hay cambio";
		}
		else {
			cambio = dinero-PRECIOCAFECONLECHE;
			cadenaMaquina="El cambio es "+cambio;
			depositoCafe--;
			depositoLeche--;
			depositoVasos--;
			monedero += PRECIOCAFECONLECHE;
		}
		return cadenaMaquina;
	}
	
	public String servir(int tipo, double dinero) {
		String cadenaFinal="";
		switch (tipo) {
			case 1: {
				cadenaFinal = servirCafe(dinero);
				break;
			}
			case 2:{
				cadenaFinal = servirLeche(dinero);
				break;
			}
			case 3:{
				cadenaFinal = servirCafeConLeche(dinero);
				break;
			}
			default:{
				cadenaFinal = "Error";
			}
		}
		return cadenaFinal;
	}
	
	public void rellenarDepositos() {
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.depositoVasos = 80;		
	}
	
	public void vaciarMonedero() {
		this.monedero = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PRECIOCAFE, PRECIOCAFECONLECHE, PRECIOLECHE, depositoCafe, depositoLeche, depositoVasos,
				monedero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaquinaCafe other = (MaquinaCafe) obj;
		return Double.doubleToLongBits(PRECIOCAFE) == Double.doubleToLongBits(other.PRECIOCAFE)
				&& Double.doubleToLongBits(PRECIOCAFECONLECHE) == Double.doubleToLongBits(other.PRECIOCAFECONLECHE)
				&& Double.doubleToLongBits(PRECIOLECHE) == Double.doubleToLongBits(other.PRECIOLECHE)
				&& depositoCafe == other.depositoCafe && depositoLeche == other.depositoLeche
				&& depositoVasos == other.depositoVasos
				&& Double.doubleToLongBits(monedero) == Double.doubleToLongBits(other.monedero);
	}

	@Override
	public String toString() {
		return "MaquinaCafe [depositoCafe=" + depositoCafe + ", depositoLeche=" + depositoLeche + ", depositoVasos="
				+ depositoVasos + ", monedero=" + monedero + "]";
	}
	
	
	
	
	
}
