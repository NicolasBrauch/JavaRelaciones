
package ejercicio1relaciones;

import java.util.Locale;
import java.util.Scanner;


public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void cargarDatosPerro(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresar nombre del Perro");
        nombre=read.next();
        System.out.println("Ingresar raza");
        raza=read.next();
        System.out.println("Ingresar Edad");
        edad=read.nextInt();
        System.out.println("Ingresar Tamaño");
        tamaño=read.next();
    }

    @Override
    public String toString() {
        return  String.format("Perro\n"+"nombre: %s\n"+"raza: %s\n"+"edad: %s\n"+"tamaño: %s\n"+"-------------------------\n",nombre,raza,edad,tamaño);
               
    }
}
