package Liga;
/**
 * Esta clase representa a cada equipo
 * Contiene el nombre y puntos de cada equipo
 * 
 * @author suroscarruiz
 * @version 1.0
 * @since 01/04/2024
 */
public class Equipos {

	private String nombre;
	private int puntos;
	
	/**
	 * crea cada jugador
	 * @param nombre elige el nombre del jugador
	 * @param dorsal elige el dorsal del jugador
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


}