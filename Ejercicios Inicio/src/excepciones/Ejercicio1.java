package excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new ArithmeticException("Esto es un error");
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}finally{
			System.out.println("Estamos en el bloque finally");
		}
	}

}
