package ejercicio2relaciones;

import java.util.ArrayList;

public class Juego {

    private RevolverDeAgua revolver;
    public ArrayList<Jugador> jugadores = new ArrayList();

    public Juego() {
    }

    public Juego(RevolverDeAgua revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda(ArrayList<Jugador> jugadores) {
        int b=0;
        while(b!=1){
            for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)==true){
                System.out.println("Se a mojado el: "+jugador);
                b=1;
            }
        }
        }
        
       
    }
}
