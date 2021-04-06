package logica;

public class DiferenciaNumero {

	public DiferenciaNumero() {
		
	}
	
	public boolean diferencia(int numero) {
		boolean respuesta = false;
		
		if(100 - numero <= 10 || 200 - numero <= 10) {
			respuesta = true;
		}
		
		return respuesta;
	}
}
