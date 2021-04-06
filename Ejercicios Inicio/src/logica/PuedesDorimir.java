package logica;

public class PuedesDorimir {

	public PuedesDorimir() {
		
	}
	
	public boolean sePuede(boolean diaDeSemana, boolean vacaciones) {
		boolean respuesta = false;
		if(diaDeSemana == false && vacaciones == true) {
			respuesta = true;
		}
		
		return respuesta;
	}
}
