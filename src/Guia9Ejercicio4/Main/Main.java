package Guia9Ejercicio4.Main;

import java.util.Date;
import Guia9Ejercicio4.Servicios.DateService;

public class Main {
    public static void main(String[] args) {
        DateService ds = new DateService();
        Date nacimiento = ds.fechaNacimiento();
        Date actual = ds.fechaActual();

        System.out.println("La edad del usuario es: " + ds.diferencia(actual, nacimiento));
    }
}
