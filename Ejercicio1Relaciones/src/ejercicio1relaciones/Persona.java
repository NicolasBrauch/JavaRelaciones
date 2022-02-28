package ejercicio1relaciones;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public Persona() {
    }

    public void vincularPerro(Perro perro) {
        this.perro = perro;
    }

    public void cargarDatosPersona() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar Nombre de la Persona ");
        nombre = read.next();
        System.out.println("Ingresar Apellido");
        apellido = read.next();
        System.out.println("Ingresar Edad");
        edad = read.nextInt();
        System.out.println("Ingresar Documento");
        documento = read.nextInt();

    }

    @Override
    public String toString() {
        return String.format("nombre de la persona: %s\n"+"apellido: %s\n"+"edad: %s\n"+"documento: %s\n"+"%s\n",nombre,apellido,edad,documento,perro);
              
    }
}
