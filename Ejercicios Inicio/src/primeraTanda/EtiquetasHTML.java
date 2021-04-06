package primeraTanda;

public class EtiquetasHTML {
	
	public EtiquetasHTML(String texto1, String texto2) {
		System.out.println("<" + texto1 + ">" + texto2 + "</	" + texto1 + ">");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EtiquetasHTML("Hola", "Mundo");
	}

}
