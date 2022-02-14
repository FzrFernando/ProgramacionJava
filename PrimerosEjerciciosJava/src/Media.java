import java.util.Scanner;

public class Media {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i,num,suma=0,media = 0;	
		
	for (i = 0;i<10;i++) {
		System.out.println("Intoduce un numero");
		num = Integer.parseInt(teclado.nextLine());
		suma += num;
	}
	
	media = suma/i;
	System.out.println("El resultado es " + media);
		
		
	}

}
