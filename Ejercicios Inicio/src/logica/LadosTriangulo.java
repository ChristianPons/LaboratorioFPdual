package logica;

public class LadosTriangulo {

	public LadosTriangulo() {
		
	}
	
	public void tipoTriangulo(float lado1,float lado2, float lado3) {
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Es un triángulo equilátero");
			
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Es un triángulo isósceles");
			
		}else {
			System.out.println("Es un triángulo escaleno");
		}
	}
}
