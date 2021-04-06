package logica;

public class ImprimirNumeros {

	public ImprimirNumeros() {
		
	}
	
	public void buscarNumeros(String texto) {
		for(int i = 0; i < texto.length(); i++) {
			if(Character.isDigit(texto.charAt(i))) {
				System.out.println(texto.charAt(i));
			}
		}
	}
}

