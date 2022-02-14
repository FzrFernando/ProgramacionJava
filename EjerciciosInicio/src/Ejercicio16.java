
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contador320Al160());
	}

	public static String contador320Al160() {
		String cadenafinal = "";
		for (int i = 320; i >= 160; i-=20) {
			cadenafinal += i + "\n";
		}
		return cadenafinal;
	}
}
