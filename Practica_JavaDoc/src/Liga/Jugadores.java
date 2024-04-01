package Liga;
/**
 * Esta clase representa a cada jugador
 * Contiene el nombre y dorsal de cada jugador
 * @author suros
 * @version 1.0
 * @since 01/04/2024
 */
public class Jugadores {

	private String nombre;
	private int dorsal;
	
	/**
	 * crea cada jugador
	 * @param nombre elige el nombre del jugador
	 * @param dorsal elige el dorsal del jugador
	 */
	
public Jugadores(String nombre, int dorsal) {
	this.nombre = nombre;
	this.dorsal = dorsal;
}

public String getNombre() {
	return nombre;
}

public int getDorsal() {
	return dorsal;
}

public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}

/**
* Te imprime los datos de cada jugador
*/
public void imprimirDatosJugador() {
	System.out.println("nombre: " + nombre);
	System.out.println("Dorsal: " + dorsal);
}

/**
 * Permite actualizar el dorsal del jugador
 */

public void actualizarDorsal(int nuevoDorsal) {
	this.dorsal = nuevoDorsal;
}

}
