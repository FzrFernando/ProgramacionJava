import java.util.Scanner;

public class MainCuenta {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta ("123456", 50);
		
		System.out.println("Bienvenido");
		System.out.println("Elija una opción: " + "\n"+ 
							"1. Hacer un reintegro. " + "\n"+
							"2. Hacer un ingreso. " + "\n" + 
							"3. Consultar el saldo y el número de reintegros e ingresos realizados " + "\n" + 
							"4. Finalizar las operaciones");
		
		char opc=' ';
		opc = teclado.nextLine().charAt(0);
		
		while (opc != '5') {
			switch (opc)
			{
				case '1':
				{
					double cantidad;
					System.out.println("Introduce cuanto quieres retirar");
					cantidad = Double.parseDouble(teclado.nextLine());
					c1.reintegro(cantidad);
					break;
				}
				case '2':
				{
					double cantidad;
					System.out.println("Introduce cuanto quieres ingresar");
					cantidad = Double.parseDouble(teclado.nextLine());
					c1.ingresar(cantidad);
					break;
				}
				case '3':
				{
					System.out.println("El saldo es " + c1.getSaldo() + ", el número de reintegros es de " + c1.getnReintegros() + " y el número de ingresos es de " + c1.getnIngresos());
					break;
				}
				case '4':
				{
					c1.getSaldo();
					break;
				}
				default:
					System.out.println("Introduce una opcion correcta");
			}
			System.out.println("Introduce una opcion");
			opc = teclado.nextLine().charAt(0);
		}
		
	}

}
