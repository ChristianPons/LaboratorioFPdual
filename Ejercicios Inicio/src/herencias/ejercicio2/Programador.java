package herencias.ejercicio2;

public class Programador extends Empleado{
	
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
		public Programador() {
			
		}
		
		public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
			this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
			this.lenguajeDominante = lenguajeDominante;
		}

		public int getLineasDeCodigoPorHora() {
			return lineasDeCodigoPorHora;
		}

		public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
			this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		}

		public String getLenguajeDominante() {
			return lenguajeDominante;
		}

		public void setLenguajeDominante(String lenguajeDominante) {
			this.lenguajeDominante = lenguajeDominante;
		}
		
		
}
