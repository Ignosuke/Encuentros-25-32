package Guia9Extras2.Servicios;

import java.util.Scanner;

import Guia9Extras2.Entidades.Ahorcado;

public class AhorcadoService {
    private Scanner leer = new Scanner(System.in);

    private final String[] palabras = {"campana", "aparato", "castillo", "guitarra", "biblioteca", "restaurante", "elefante", "computadora", "helicoptero", "refrigerador"};
    private final int indice = (int) (Math.random()*9+1);

    public Ahorcado crearJuego() {
        return new Ahorcado(palabras[indice],10);
    }

    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length());
    }

    public void buscar(Ahorcado a) {
        System.out.print("Ingrese una letra: ");
        char letra = leer.next().charAt(0);
        System.out.println();
        for (int i = 0; i < a.getLetras().length; i++) {
            if (a.getLetras()[i] == letra) {
                a.setEncontradas(a.getEncontradas()+1);
                a.setFaltantes(a.getFaltantes()-1);
                a.setLetraEncontrada(i);
            }
        }
    }

    public void mostrarEncontradasFaltantes(Ahorcado a) {
        System.out.println("Encontradas: " + a.getEncontradas());
        System.out.println("Faltantes: " + a.getFaltantes());
        System.out.println();
    }

    public void mostrarIntentos(Ahorcado a) {
        System.out.println("Intentos restantes: " + a.getIntentos());
    }

    public void iniciarJuego() {
        Ahorcado a = crearJuego();
        longitud(a);
        System.out.println("\n============================================\n");
        System.out.println("                   INICIO");
        System.out.println("\n============================================\n");

        while (a.getIntentos() > 0 && a.getFaltantes() > 0) {
            a.setIntentos(a.getIntentos()-1);
            buscar(a);
            mostrarEncontradasFaltantes(a);
            mostrarIntentos(a);
            System.out.println("\n============================================\n");
        }
        if (a.getFaltantes() == 0) {
            System.out.println("Felicidades! Adivinaste la palabra " + palabras[indice]);
        } else {
            System.out.println("Mala suerte. Tu palabra era " + palabras[indice]);
        }
    }
}