package logica;

public class ImprimirPalindromos {

	public ImprimirPalindromos(String frase) {
		boolean palindromo = false;
		String fraseInversa = "";

		for (int i = frase.length(); i > 0; i--) {
			fraseInversa += frase.substring(i - 1, i);
		}

		if (frase.strip().equals(fraseInversa.strip())) {
			palindromo = true;
		}

		System.out.println(palindromo);

	}
}
