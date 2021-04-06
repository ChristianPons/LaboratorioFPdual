package excepciones.ejercicio10;

public class Padre extends Exception{

	public Padre() {

	}
	
	public void excepcion() {
		throw new ArithmeticException();
	}

	
}
