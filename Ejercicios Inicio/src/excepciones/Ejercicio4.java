package excepciones;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double prueba = null;
		try {
		prueba.intValue();
		}catch(NullPointerException e) {
			System.out.println("El objeto es nulo");
		}
	}

}
