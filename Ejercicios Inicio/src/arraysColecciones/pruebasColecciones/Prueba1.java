package arraysColecciones.pruebasColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prueba1 {

	public static void main(String[] argas) {
		HashSet<String> lista = new HashSet<>();
		PriorityQueue<Integer> prueba = new PriorityQueue<>();
		ArrayList<Integer> array = new ArrayList<>();
		prueba.add(1);
		prueba.add(13);
		prueba.add(8);
		prueba.add(18);
		System.out.println(prueba);
		System.out.println(prueba.peek());
		System.out.println(prueba);
		
		Integer valor;
		while((valor = prueba.poll()) != null) {
			System.out.println(valor);
		}
	
		
	}
}
