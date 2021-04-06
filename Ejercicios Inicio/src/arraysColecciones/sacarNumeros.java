package arraysColecciones;

public class sacarNumeros {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] valores = {"pepe","1","12","camion","u3no","14"};
		String[] numeros = comporbarArray(valores);
		
		for(String x : numeros) {
			if(x != null) {
				System.out.println(x);
			}
		}
	}
	
	public static String[] comporbarArray(String[] valores) {
		String nums = "0123456789";
		String[] numeros = new String[valores.length];
		
		for(int i = 0; i < valores.length; i++) {
			String valor = valores[i];
			for(int j = 0; j < valor.length(); j++) {
				if(nums.contains(valor.substring(j, j + 1))){
					numeros[i] = valor;
					j = valor.length();
				}
			}
		}
	
		return numeros;
	}

}
