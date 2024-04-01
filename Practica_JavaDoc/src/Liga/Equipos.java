package Liga;
/**
 * Esta clase representa a cada equipo
 * Contiene el nombre y puntos de cada equipo
 * 
 * @author suros
 * @version 1.0
 * @since 01/04/2024
 */
public class Equipos {

	private String nombre;
	private int puntos;
	
	/**
	 * crea cada jugador
	 * @param nombre elige el nombre del equipo
	 * @param puntos elige los puntos del equipo
	 */
	
public Equipos(String nombre, int puntos) {
	this.nombre = nombre;
	this.puntos = puntos;
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	* Te imprime los datos del equipo
	*/
	public void imprimirDatosEquipos() {
		System.out.println("nombre: " + nombre);
		System.out.println("puntos: " + puntos);
	}

	/**
	 * Añade puntos al equipo
	 * @param SumaPuntos
	 */
	public void sumaPuntos(int sumaPuntos) {
		this.puntos += sumaPuntos;
	}
	
	
	
}