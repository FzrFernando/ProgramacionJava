
public class Partido {

	private static final int JORNADAMAX = 38;
	private int jornada;
	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitantes;
	private boolean jugado;
	
	public Partido(int jornada, Equipo local, Equipo visitante) throws PartidoException {
		super();
		if(local.equals(visitante)) {
			throw new PartidoException("No pueden jugar contra si mismos");
		}
		if(jornada < 1 || jornada > JORNADAMAX) {
			throw new PartidoException("Error en el número de jornadas");
		}
		this.jornada = jornada;
		this.local = local;
		this.visitante = visitante;
		this.jugado = false;
	}
	
	public String getResultado() {
		String resultado;
		if (this.golesLocal == this.golesVisitantes)
			resultado = "X";
		else if (this.golesLocal > this.golesVisitantes)
			resultado = "1";
		else
			resultado = "2";
		return resultado;
	}
	
	
}
