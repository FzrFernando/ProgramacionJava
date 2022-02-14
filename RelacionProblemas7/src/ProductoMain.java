import java.util.Scanner;

public class ProductoMain {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws ProductoException {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(0.75,"Botella de agua");
		p1.calcularPrecioConIva();
		System.out.println(p1);
		Producto p2 = new Producto(1,"Lata Coca Cola");
		System.out.println(p2.calcularPrecioConIva());
		System.out.println(p2);
		p2.setPrecio(0.9);
		System.out.println(p2.calcularPrecioConIva());
	}

}
