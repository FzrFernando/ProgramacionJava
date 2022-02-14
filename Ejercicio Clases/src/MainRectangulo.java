import java.util.Scanner;

public class MainRectangulo {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double longitud,ancho;
		Rectangulo r1 = new Rectangulo();
		
		System.out.println("Dime la longitud del rectangulo");
		longitud = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Dime el ancho del rectangulo");
		ancho = Double.parseDouble(teclado.nextLine());
		
		r1.setLongitud(longitud);
		r1.setAncho(ancho);
		System.out.println(r1);
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
		
	}

}
