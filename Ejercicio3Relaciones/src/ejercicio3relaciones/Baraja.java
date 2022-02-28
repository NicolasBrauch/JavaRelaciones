package ejercicio3relaciones;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private paloCarta palo;
    private int numero;
    public ArrayList<Baraja> baraja = new ArrayList();
    public ArrayList<String> cartasSalidas=new ArrayList();
    private int i=0;
    
    
    
    public Baraja() {
    }

    public Baraja(paloCarta palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public paloCarta getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Baraja> getBaraja() {
        return baraja;
    }

    public void setPalo(paloCarta palo) {
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBaraja(ArrayList<Baraja> baraja) {
        this.baraja = baraja;
    }

    public void CargarCartas() {

        for (int j = 0; j < 4; j++) {

            for (int i = 1; i < 13; i++) {
                if (i!=8&&i!=9 ) {
                    numero = i;
                    switch (j) {
                        case 0:
                            palo = paloCarta.BASTOS;
                            break;
                        case 1:
                            palo = paloCarta.COPAS;
                            break;
                        case 2:
                            palo = paloCarta.ORO;
                            break;
                        case 3:
                            palo = paloCarta.ESPADAS;
                            break;
                    }
                    baraja.add(new Baraja(palo, numero));
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }

    public void siguienteCarta(ArrayList baraja){
        if (i!=40){
            System.out.println(baraja.get(i));
            cartasSalidas.add(baraja.get(i).toString());
            i++;
        }else{
            System.out.println("No hay mas cartas");
        }
        
    }
    
    public int cartasDisponibles(){
        int disponibles=40-i;
        System.out.println("Cartas disponibles: "+disponibles );
        return disponibles;
    }
    
    public void darCartas(int cantidad){
    int dispone=cartasDisponibles();
        if(cantidad<=dispone){
           for (int j = 0; j < cantidad; j++) {
            siguienteCarta(baraja);
            } 
        }else{
            System.out.println("No queda esa cantidad de cartas en la baraja");
        }
    }
    
    public void cartasMonton(){
        for (String aux : cartasSalidas) {
            System.out.println(aux);
        }
    }
    
    public void mostrarBaraja(){
        for ( int j=i; j < 40; j++) {
            System.out.println( baraja.get(j));
        }
           
         
    }
    
    @Override
    public String toString() {
        return  numero +" de "+ palo ;
    }
}
