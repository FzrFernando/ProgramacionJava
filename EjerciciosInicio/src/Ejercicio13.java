
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiplos5());
	}

	public static String multiplos5() {
		String cadenafinal = "";
		for (int i = 5; i <= 100; i++) {
			if (i % 5 == 0) {
				cadenafinal += i + "\n";
			}
		}
		return cadenafinal;
	}
}
