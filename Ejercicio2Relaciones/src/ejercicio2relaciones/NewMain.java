
package ejercicio2relaciones;

import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        Juego juego= new Juego();
        Jugador jugador= new Jugador();
        RevolverDeAgua revolver= new RevolverDeAgua();
        ArrayList<Jugador> jugadores=new ArrayList();
       
        revolver.llenarRevolver();
        jugadores=jugador.cargarDatosJugador();  
    
        juego.llenarJuego( jugadores, revolver); 
        juego.ronda(jugadores);
         
    }
    
}
