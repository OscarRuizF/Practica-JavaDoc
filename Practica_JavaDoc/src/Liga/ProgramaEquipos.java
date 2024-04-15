package Liga;

/**
 * Esta es la clase main que tiene implementada las clases equipos y jugadores
 * @author jose
 * @version 1.2
 * @since 015/04/2024
*/
public class ProgramaEquipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//crea el equipo Real Madrid		
Equipos realMadrid = new Equipos("Real Madrid" , 50);

//Crea el jugador joselu
Jugadores joselu = new Jugadores ("Joselu", 20);

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
