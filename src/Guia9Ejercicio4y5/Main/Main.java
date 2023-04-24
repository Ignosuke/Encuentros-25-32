package Guia9Ejercicio4y5.Main;

import Guia9Ejercicio4y5.Entidades.Persona;
import Guia9Ejercicio4y5.Servicios.DateService;
import Guia9Ejercicio4y5.Servicios.PersonaService;

public class Main {
    public static void main(String[] args) {
        DateService ds = new DateService();
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona(ds);
        System.out.println();
        ps.calcularEdad(p, ds);
        System.out.println();
        ps.menorQue(p, ds, 35);
        System.out.println();
        ps.mostrarPersona(p, ds);
    }
}
