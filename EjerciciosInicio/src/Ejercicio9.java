
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100());
		
	}

	public static String contar100() {
		int i = 1;
		String cadenafinal = "";
		do {
			cadenafinal += i + "\n";
			i++;
		}while (i <= 100);
		return cadenafinal;
	}
}
