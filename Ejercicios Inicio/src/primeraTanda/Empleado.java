package primeraTanda;

public class Empleado {

	private int numeroEmpleado;
	private String nombre;
	private int departamento;
	
	public Empleado(int numeroEmpleado, String nombre, int depatamento) {
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.departamento = depatamento;
	}
	
	public void cambioDepartamento(int nuevoDepartamento) {
		departamento = nuevoDepartamento;
	}
	
	public void cambiarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void mostrarDuda(String texto) {
		System.out.println(texto);
	}
}
