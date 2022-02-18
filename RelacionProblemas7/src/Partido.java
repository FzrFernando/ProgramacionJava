
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
	
	public void ponerResultado(String resultado) throws PartidoException{
		int pos = resultado.indexOf('-');
		if (pos == -1) {
			throw new PartidoException("Error en el formato");
		}
		try {
			int golesLocal = Integer.parseInt(resultado.substring(0,pos));
			int golesVisitante = Integer.parseInt(resultado.substring(pos,1));
			this.golesLocal = golesLocal;
			this.golesVisitantes = golesVisitante;
			this.jugado = true;
		} catch (Exception e) {
			throw new PartidoException("Error en el formato");
		}
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(int golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	public int getJornada() {
		return jornada;
	}

	public Equipo getLocal() {
		Equipo local = new Equipo(this.local.getNombre(), this.local.getCiudad(),this.local.getEstadio());
		return local;
	}

	public Equipo getVisitante() {
		Equipo visitante = new Equipo(this.visitante.getNombre(), this.visitante.getCiudad(),this.visitante.getEstadio());
		return visitante;
	}
	
	
}
