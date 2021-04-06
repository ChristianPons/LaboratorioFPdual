package logica;

public class EmpiezaPorPrograma {

	public EmpiezaPorPrograma() {
		
	}
	
	public boolean siEmpieza(String texto) {
		String programa = "programa";
		boolean resultado = false;
		
		try {
			if(texto.substring(0,8).equals(programa)) {
				resultado = true;
			}
			
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("El texto es demasiado corto");
		}
		return resultado;
		
		
		
	}
}
