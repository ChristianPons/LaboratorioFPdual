package logica;

public class ContarInicios {

	private static int inicios = 0;
	
	public ContarInicios() {
		inicios ++;
	}

	public static int getInicios() {
		return inicios;
	}

	public static void setInicios(int inicios) {
		ContarInicios.inicios = inicios;
	}
	
	
}
