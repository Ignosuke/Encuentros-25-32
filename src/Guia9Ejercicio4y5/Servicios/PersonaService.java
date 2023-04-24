package Guia9Ejercicio4y5.Servicios;

import java.util.Scanner;

import Guia9Ejercicio4y5.Entidades.Persona;

public class PersonaService {
    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona(DateService ds) {
        String nombre;
        System.out.println("Ingrese el nombre de la persona: ");
        nombre = leer.nextLine();

        return new Persona(nombre, ds.fechaNacimiento());
    }

    public int calcularEdad(Persona p, DateService ds) {
        // System.out.println("La edad de la persona es: " + ds.diferencia(ds.fechaActual(), p.getFechaNac()));

        return ds.diferencia(ds.fechaActual(), p.getFechaNac());
    }

    public boolean menorQue(Persona p, DateService ds, int edad) {
        if (calcularEdad(p, ds) < edad) {
            System.out.println("La edad de la persona es menor a: " + edad);
            return true;
        } else {
            System.out.println("La edad de la persona es mayor o igual a: " + edad);
            return false;
        }
    }

    public void mostrarPersona(Persona p, DateService ds) {
        System.out.println("El nombre de la persona es: " + p.getNombre());
        System.out.println("La fecha de nacimiento de la persona es: " + p.getFechaNac());
        System.out.println("La edad de la persona es: " + calcularEdad(p, ds));
    }
}
