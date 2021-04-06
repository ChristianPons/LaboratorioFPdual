package excepciones.ejercicio10;

import java.lang.reflect.InaccessibleObjectException;

public class Hijo extends Padre {

	public Hijo() {
		super();
	}
	
	@Override
	public void excepcion() {
		throw new InaccessibleObjectException();
	}
}
