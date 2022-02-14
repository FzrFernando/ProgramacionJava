
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100AlReves());
	}
	
	public static String contar100AlReves() {
		int i = 100;
		String cadenafinal = "";
		do {
			cadenafinal += i + "\n";
			i--;
		}while (i >= 1);
		return cadenafinal;
	}

}
