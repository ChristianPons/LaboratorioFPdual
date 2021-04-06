package excepciones.ejercicio10;



public class Nieto extends Hijo{

	public Nieto() {
		super();
	}
	
	@Override
	public void excepcion() {
		throw new IndexOutOfBoundsException();
	}
}
