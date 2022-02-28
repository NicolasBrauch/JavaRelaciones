package ejercicio3relaciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3Relaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Baraja baraja = new Baraja();
        int opcion = 0;
        baraja.CargarCartas();

        do {
            System.out.println("");
            System.out.println("Elija una opción: ");
            System.out.println("1) Mezclar baraja");
            System.out.println("2) Mostrar siguiente carta");
            System.out.println("3) Mostrar cantidad de cartas que quedan en la baraja");
            System.out.println("4) Sacar cartas");
            System.out.println("5) Mostrar cartas que salieron");
            System.out.println("6) Mostrar todas las cartas que quedan en la baraja");
            System.out.println("7) Salir");
            System.out.println("");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Baraja desordenada");
                    baraja.barajar();
                    for (Baraja arg : baraja.baraja) {
                        System.out.println(arg);
                    }
                    break;
                case 2:
                    System.out.println("Siguiente carta");
                    baraja.siguienteCarta(baraja.baraja);
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    System.out.println("Cuantas cartas quiere?  ");
                    int cantidad = leer.nextInt();
                    baraja.darCartas(cantidad);
                    break;
                case 5:
                    System.out.println("Cartas que salieron");
                    baraja.cartasMonton();
                    break;
                case 6:
                    System.out.println("Cartas disponibles");
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 7);

    }

}
