
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100AlReves());
	}

	public static String contar100AlReves() {
		String cadenafinal = "";
		for (int i = 100; i >= 1 ; i--) {
			cadenafinal += i + "\n";
		}
		return cadenafinal;
	}
}
