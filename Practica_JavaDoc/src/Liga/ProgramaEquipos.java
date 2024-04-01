package Liga;

/**
 * Esta es la clase main que tiene implementada las clases equipos y jugadores
 * @author suros
 * @version 1.1
 * @since 01/04/2024
*/
public class ProgramaEquipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//crea el equipo Real Madrid		
Equipos realMadrid = new Equipos("Real Madrid" , 60);

//Crea el jugador joselu
Jugadores joselu = new Jugadores ("Joselu", 10);

//Incrementa los puntos del equipo seleccionado
realMadrid.sumaPuntos(3);

// Imprime los datos del equipo actualizados
realMadrid.imprimirDatosEquipos();

//Cambia el dorsal del jugador
joselu.actualizarDorsal(14);

// Imprime los datos del jugador actualizados
joselu.imprimirDatosJugador();
	
	}
}
