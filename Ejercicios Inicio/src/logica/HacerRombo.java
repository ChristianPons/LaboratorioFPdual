package logica;

public class HacerRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroPuntos = 9;
		int  numeroEspacios = numeroPuntos / 2;
		String linea;
		
		for(int i = 1; i <= numeroPuntos; i += 2) {
			linea = "";
			
			for(int j = 0; j < numeroEspacios; j++) {
				linea += " "; 
			}
			
			numeroEspacios--;
			
			for(int k = 0; k < i; k++) {
				linea += "*";
			}
			
			System.out.println(linea);		
		}
		
		numeroEspacios = 1;
		
		for(int i = numeroPuntos - 2; i >= 0; i -= 2) {
			linea = "";
			
			for(int j = 0; j < numeroEspacios; j++) {
				linea += " ";
			}
			
			numeroEspacios++;
			
			for(int k = 0; k < i; k++) {
				linea += "*";
			}
			
			System.out.println(linea);
		}
	}

}
