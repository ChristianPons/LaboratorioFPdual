package excepciones;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			lanzarExcepciones();
		} catch (Excepcion1 | Excepcion2 | Excepcion3 e) {
			System.out.println(e.getClass());
		}

	}

	private static void lanzarExcepciones() throws Excepcion1, Excepcion2, Excepcion3 {
		// TODO Auto-generated method stub
		throw new Excepcion2();

	}

}
