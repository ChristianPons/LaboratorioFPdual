package arraysColecciones;

public class Contiene2o3 {

	public Contiene2o3() {
		
	}

	private boolean comprobarArray(int[] numeros) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		for(int x : numeros) {
			if(x == 2 || x == 3) {
				resultado = true;
				x = numeros.length;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {0,1,1,1,4,5,6};
		boolean resultado = new Contiene2o3().comprobarArray(numeros);
		System.out.println(resultado);
	}

}
