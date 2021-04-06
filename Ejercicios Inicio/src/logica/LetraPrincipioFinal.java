package logica;

public class LetraPrincipioFinal {

	public LetraPrincipioFinal() {

	}
	
	public String ponerLetra(String texto) {
		String letra = texto.substring(texto.length() - 1);
		texto = letra + texto + letra;
		return texto;
	}
}
