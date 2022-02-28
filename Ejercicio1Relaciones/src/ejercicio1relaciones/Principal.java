
package ejercicio1relaciones;


public class Principal {

    
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona();
        Perro perro1= new Perro();
        Perro perro2= new Perro();
        
       
        System.out.println("Persona 1");
        persona1.cargarDatosPersona();
        System.out.println("Perro 1");
        perro1.cargarDatosPerro();
        System.out.println("Persona 2");
        persona2.cargarDatosPersona();
        System.out.println("Perro 2");
        perro2.cargarDatosPerro();
        persona1.vincularPerro(perro1);
        persona2.vincularPerro(perro2);
        
        System.out.println(persona1);
        System.out.println(persona2);
    }
    
}
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona*/