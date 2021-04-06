package excepciones;

public class Ejercicio2 {

	public static void main(String[] args) {
	try {
		throw new Excepcion1("Mensaje del error");
		
	}catch(Excepcion1 e) {
		e.imprimir();
	}
	}
}
