
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contar100());
	}
	
	public static String contar100() {
		int i = 1;
		String cadenafinal = "";
		while (i <= 100) {
			cadenafinal += i + "\n";
			i++;
		}
		return cadenafinal;
	}
}
