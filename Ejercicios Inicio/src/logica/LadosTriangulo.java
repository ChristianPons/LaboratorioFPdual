package logica;

public class LadosTriangulo {

	public LadosTriangulo() {
		
	}
	
	public void tipoTriangulo(float lado1,float lado2, float lado3) {
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Es un tri�ngulo equil�tero");
			
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Es un tri�ngulo is�sceles");
			
		}else {
			System.out.println("Es un tri�ngulo escaleno");
		}
	}
}
