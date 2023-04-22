package Guia9Ejercicio2.Main;

import Guia9Ejercicio2.Entidades.ParDeNumeros;
import Guia9Ejercicio2.Servicios.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {
        ParDeNumerosService ps = new ParDeNumerosService();
        ParDeNumeros p = new ParDeNumeros();

        ps.mostrarNumeros(p);
        System.out.println();
        ps.calcularPotencia(p);
        System.out.println();
        ps.calcularRaiz(p);
    }
}
