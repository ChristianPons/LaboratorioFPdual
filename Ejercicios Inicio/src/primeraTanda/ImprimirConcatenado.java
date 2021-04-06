package primeraTanda;

import java.util.ArrayList;
import java.util.Arrays;

public class ImprimirConcatenado {

	
	public ImprimirConcatenado(ArrayList parametros) {
		String concatenado = "";
		for(int i = 0; i < parametros.size(); i++) {
			concatenado += parametros.get(i);
		}
		System.out.println(concatenado);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> parametros = new ArrayList<>(Arrays.asList("1","pepe","Murcia"));
		new ImprimirConcatenado(parametros);
	}

}
