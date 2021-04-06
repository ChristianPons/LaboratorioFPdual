package arraysColecciones;

public class Contiene6 {
	
	public Contiene6() {
		
	}
	
	private Boolean comprobarArray(int[] numeros) {
		// TODO Auto-generated method stub
		boolean resultado = true;
		
		if(numeros[0] == 6) {
			resultado = true;
			
		} else if(numeros[numeros.length - 1] == 6) {
			resultado = true;
			
		}else {
			resultado = false;
		}
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {6,2,3,4,5,6,0};
		Boolean respuesta = new Contiene6().comprobarArray(numeros);
		System.out.println(respuesta);
		
	}

}


