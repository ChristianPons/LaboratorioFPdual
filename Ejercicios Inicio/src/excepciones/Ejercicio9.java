package excepciones;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sinErrores = false;
		int contador = 0;
		
		while(sinErrores == false) {
			try {
				if(contador < 2) {
					throw new ArithmeticException();
					
				}else {
					sinErrores = true;
					
				}
					
			}catch(ArithmeticException e) {
				contador++;
				System.out.println("Error: " + contador + " de 2");
			}
		}
		
		System.out.println("Ya no hay errores");
	}

}
