
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiplos5());
	}

	public static String multiplos5() {
		int i = 5;
		String cadenafinal = "";
		do {
			if (i % 5 == 0){
				cadenafinal += i + "\n";
			}
			i++;
		}while (i <= 100);
		return cadenafinal;
	}
}
