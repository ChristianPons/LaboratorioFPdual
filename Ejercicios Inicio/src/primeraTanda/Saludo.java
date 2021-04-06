package primeraTanda;

import java.util.Scanner;

public class Saludo {

	public Saludo(String saludo) {
		System.out.println("Hola " + saludo);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el saludo");
		String saludo = sc.nextLine();
		new Saludo(saludo);
	}
}

