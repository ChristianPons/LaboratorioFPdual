package excepciones;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1,2,3};
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(numeros[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ha ocurrido un error");
		}
		
	}

}
