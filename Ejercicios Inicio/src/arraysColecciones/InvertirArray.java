package arraysColecciones;

public class InvertirArray {
	
	public InvertirArray() {
		
	}
	
	public int[] invertir(int[] numeros) {
		int[] invertido = new int[numeros.length];
		int espacio = numeros.length - 1;
		
		for(int i = 0; i < invertido.length; i++) {
			invertido[i] = numeros[espacio];
			espacio--;
		}
		return invertido;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1,2,3,4,5,6,7,8};
		int[] invertido = new InvertirArray().invertir(numeros);
		
		for(int x : invertido) {
			System.out.println(x);
		}

	}

}
