
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiplos5());
	}

	public static String multiplos5() {
		int i = 5;
		String cadenafinal = "";
		while (i <= 100) {
			if (i % 5 == 0){
				cadenafinal += i + "\n";
			}
			i++;
		}
		return cadenafinal;
	}
}
