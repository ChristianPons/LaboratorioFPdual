package logica;

public class NumeroVocales {
	
	private String vocales = "aeiou";

	public NumeroVocales(String texto) {
		int cantidad = 0;
		texto = texto.toLowerCase();
		for(int i = 0; i < texto.length(); i++) {
			if(vocales.contains(texto.substring(i, i + 1))) {
				cantidad++;
			}
		}
		
		System.out.println("Tiene " + cantidad + "vocales");
	}
}
