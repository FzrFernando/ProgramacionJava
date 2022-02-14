
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100AlReves());
	}

	public static String contar100AlReves() {
		int i = 100;
		String cadenafinal = "";
		while (i >= 1) {
			cadenafinal += i + "\n";
			i--;
		}
		return cadenafinal;
	}
}
