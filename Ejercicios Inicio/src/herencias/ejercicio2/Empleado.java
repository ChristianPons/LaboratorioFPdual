package herencias.ejercicio2;

public class Empleado {

	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	public Empleado(){
		
	}
	
	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public void calsificacionEdad() {
		if(edad <= 21) {
			System.out.println("Principiante");
			
		}else if(edad >= 22 && edad <= 35) {
			System.out.println("Intermedio");
		} else {
			System.out.println("Senior");
		}
	}
	
	public void mostrarDatos() {
		System.out.println("nombre: " + nombre + "\n" + "cedula: "
	+ cedula + "\n" + "edad: " + edad + "\n" + "casado: " + casado + "\n" + "salario: " + salario);
	}
	
	public void aumentarSueldo(int cantidad) {
		salario = salario + (salario * cantidad)/100;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
