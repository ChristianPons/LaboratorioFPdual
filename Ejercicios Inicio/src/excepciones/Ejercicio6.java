package excepciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		metodo1();
	}

	private static void metodo1() {
		// TODO Auto-generated method stub
		try {
		metodo2();
		} catch(RuntimeException e) {
			
			
		}
	}

	private static void metodo2() throws ArithmeticException{
		// TODO Auto-generated method stub
		throw new ArithmeticException();
	}

}
