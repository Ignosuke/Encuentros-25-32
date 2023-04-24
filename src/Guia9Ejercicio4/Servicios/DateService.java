package Guia9Ejercicio4.Servicios;

import java.util.Date;
import java.util.Scanner;

public class DateService {
    private Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        int dia, mes, anio;
        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();

        return new Date(anio-1900, mes-1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date actual, Date nacimiento) {
        int edad = actual.getYear() - nacimiento.getYear();
        if (actual.compareTo(nacimiento) > 0) {
            edad--;
        }
        return edad;
    }
}
