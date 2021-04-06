package primeraTanda;

public class Cliente {

	private String nombre;
	private String dni;
	private int edad;
	private boolean socio;
	private int dineroIngresado;
	
	public Cliente(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		socio = false;
	}
	
	public void cambiarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void ingresarDinero(int cantidad) {
		dineroIngresado += cantidad;
	}
	
	public void sacarDinero(int cantidad) {
		dineroIngresado -= cantidad;
	}
	
	public int comprobarDinero() {
		return dineroIngresado;
	}
	
	public void cambiarAfiliación(boolean cambio) {
		socio = cambio;
	}
	
}
