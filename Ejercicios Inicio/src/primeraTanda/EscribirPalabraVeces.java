package primeraTanda;

import java.util.Scanner;

public class EscribirPalabraVeces {

	public EscribirPalabraVeces(String texto, int veces) {
		for(int i = 0; i < veces; i++) {
			System.out.println(texto);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Escribe la palabra deseada");
		String texto = escribir().next();
		System.out.println("¿Cuántas veces se va a repetir?");
		int veces = escribir().nextInt();
		new EscribirPalabraVeces(texto, veces);
		
	}

	private static Scanner escribir() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		return sc;
	}
}
