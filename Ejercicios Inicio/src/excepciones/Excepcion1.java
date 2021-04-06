package excepciones;

public class Excepcion1 extends Exception{

	private String mensaje;
	
	public Excepcion1(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void imprimir() {
		System.out.println(mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}	
}
