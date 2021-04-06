package logica;

public class RetornarDiferencia {

	public RetornarDiferencia() {
		
	}
	
	public int diferenciaCon21(int numero){
		int resultado = 0;
		
		if(numero > 21) {
			resultado = numero - 21;
			
		}else {
			resultado = (21 - numero) * 2;
		}
		
		return resultado;
	}
}
