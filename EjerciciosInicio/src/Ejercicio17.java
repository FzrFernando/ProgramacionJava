
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contador320Al160());
	}

	public static String contador320Al160() {
		String cadenafinal = "";
		int i = 320;
		while (i >= 160) {
			cadenafinal += i + "\n";
			i-=20;
		}
		return cadenafinal;
	}
}
