package primeraTanda;

public class Orden {

	private int numero;
	private String texto; 
	private Cliente cliente;
	private Empleado empleado;
	private boolean cambio;
	private int tipoOrden;
	
	public Orden() {
		numero = 0;
		cambio = false;
	}
	
	public void añadirCliente(String nombre, String dni, int edad) {
		cliente = new Cliente(nombre, dni, edad);
		numero = numero + 1;
		texto = "Se ha añadido un nuevo cliente";
		tipoOrden = 1;
	}
	
	public void añadirEmpleado(int numeroEmpleado, String nombre, int depatamento) {
		Empleado empleado = new Empleado(numeroEmpleado, nombre, depatamento);
		numero = numero + 1;
		texto = "Se ha añadido un nuevo cliente";
		tipoOrden = 2;
	}
	
	public void mostrarUltimaOrden() {
		System.out.println("Orden: " + numero + "\n" + "Tipo de orden: "
				+ tipoOrden + "\n" + "mensaje: " + texto);
	}
	
	// Hay que añadir otro método
}
