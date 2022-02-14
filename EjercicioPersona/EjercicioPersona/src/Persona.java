import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private Password password;
	private char sexo;
	private double peso;
	private double altura;
	private final int PESOMENOR=20;
	private final int PESOMAYOR=25;
	
	
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.dni = generarDNI();
		this.password = new Password();
		this.sexo = 'M';
		this.peso = 0;
		this.altura = 0;
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generarDNI();
		this.password = new Password();
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.password = new Password();
	}

	private String generarDNI() {
		String dniCreado = "";
		for (int i=0; i<8;i++) {
			int numero=ThreadLocalRandom.current().nextInt(9);
			dniCreado+=numero;
		}
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		int genera=Integer.parseInt(dniCreado)%23;
		char letra=letras.charAt(genera);
		dniCreado+=letra;
		return dniCreado;
	}
	
	private String getNombre() {
		return nombre;
	}
	private int getEdad() {
		return edad;
	}
	private String getDNI() {
		return dni;
	}
	private Password getPassword() {
		return password;
	}
	private char getSexo() {
		return sexo;
	}
	private double getPeso() {
		return peso;
	}
	private double getAltura() {
		return altura;
	}
	
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int edad) throws Exception {
		if (edad < 0 || edad > 120) {
			throw new Exception("Edad incorrecta");
		}
		this.edad = edad;
	}


	private void setPassword(Password password) {
		this.password = password;
	}


	private void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	private void setAltura(double altura) {
		this.altura = altura;
	}


	public boolean esMayorDeEdad() {
		boolean resultado=false;
		if(this.edad>=18) {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	
	public boolean comprobarSexo(char sexo) {
		boolean resultado=false;
		if (sexo=='H' || sexo=='M') {
			resultado=true;
		}
		return resultado;
	}
	
	public int calcularIMC() {
		int resultado;
		double IMC=this.peso/(this.altura*this.altura);
		if(IMC<PESOMENOR) {
			resultado=-1;
		}else if (IMC>=PESOMENOR && IMC<=PESOMAYOR) {
			resultado=0;
		}else {
			resultado=1;
		}
		return resultado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", password=" + password + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
