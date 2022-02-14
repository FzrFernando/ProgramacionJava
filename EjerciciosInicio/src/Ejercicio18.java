
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contador320Al160());
	}

	public static String contador320Al160() {
		String cadenafinal = "";
		int i = 320;
		do {
			cadenafinal += i + "\n";
			i-=20;
		}while (i >= 160);
		return cadenafinal;
	}
}
