
public class MainPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Password p1 = new Password(8);
		p1.generarPassword();
		System.out.println(p1);
		Persona p2 = new Persona();
		System.out.println(p2);
		System.out.println(p2.comprobarSexo('H'));
		p2.setPeso(79);
		System.out.println(p2);
	}

}
