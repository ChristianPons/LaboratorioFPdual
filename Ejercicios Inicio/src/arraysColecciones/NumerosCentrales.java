package arraysColecciones;

public class NumerosCentrales {
	
	public NumerosCentrales() {
		
	}
	
	public int[] comprobarArray(int[] numeros){
		int[] centrales = new int[2];
		
		try {
			
			if(numeros.length % 2 != 0) {
				throw new IllegalArgumentException();
				
			}
			
			int valores = numeros.length / 2;
			
			centrales[0] = numeros[valores - 1];
			centrales[1] = numeros[valores];
		
			
			
		}catch(IllegalArgumentException e){
				System.out.println("El array debe ser par");
			}
			
			
		return centrales;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {0,1,2,3,4,5,6,7};
		int[] resultado = new NumerosCentrales().comprobarArray(numeros);
		
		for(int x : resultado) {
			System.out.println(x);
		}
	}

}
