
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100());
	}

	public static String contar100() {
		String cadenafinal = "";
		for (int i = 1; i <= 100 ; i++) {
			cadenafinal += i + "\n";
		}
		return cadenafinal;
	}
}
