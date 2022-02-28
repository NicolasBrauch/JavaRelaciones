package ejercicio2relaciones;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;

        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> cargarDatosJugador() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int cantJugadores;
        System.out.println("Ingresar cantidad de jugadores (1-6)");
        cantJugadores = read.nextInt();

        if (cantJugadores > 6 || cantJugadores < 1) {
            cantJugadores = 6;
        }
        System.out.println("La cantidad de jugadores es:  " + cantJugadores);
        for (int i = 0; i < cantJugadores; i++) {
            this.id = i+1;
            this.nombre = "Jugador " + (i+1);
            mojado = false;
            jugadores.add(new Jugador(id, nombre, mojado));

        }
        return jugadores;
    }

    public boolean disparo(RevolverDeAgua revolver) {

        if (revolver.mojar() == true) {
            mojado = true;
            revolver.siguienteChorro();
            return true;   
        }else{
            mojado=false;
            revolver.siguienteChorro();
            return false;
        }
       
    }

    @Override
    public String toString() {
        return "Jugador " + id ;
    }
    
}
