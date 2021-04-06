package logica;

public class EsAdolescente {

	public EsAdolescente() {

	}

	public boolean comprobarEdad(int edad1, int edad2, int edad3) {
		boolean hayAdolescente = false;

		if ((edad1 >= 13 && edad1 <= 19) || (edad2 >= 13 && edad2 <= 19) || (edad3 >= 13 && edad3 <= 19)) {
			hayAdolescente = true;
		}

		return hayAdolescente;
	}

}
