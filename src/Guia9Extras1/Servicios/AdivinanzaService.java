package Guia9Extras1.Servicios;

import java.util.Scanner;

import Guia9Extras1.Entidades.Adivinanza;

public class AdivinanzaService {
    private Scanner leer = new Scanner(System.in);
    private String input = "";
    private int intentos = 0;

    public void jugar() {
        Adivinanza a = new Adivinanza();

        while(!a.getSecreto().equalsIgnoreCase(input)) {
            System.out.print("Adivina el mes: ");
            input = leer.next().toUpperCase();
            intentos++;

            if (a.getSecreto().equalsIgnoreCase(input)) {
                System.out.println("Felicidades! Adivinaste en " + intentos + " intentos");
                break;
            }
            System.out.println("Incorrecto, intentalo de nuevo");
        }
    }
}
