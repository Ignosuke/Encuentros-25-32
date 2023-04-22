package Guia9Ejercicio3.Main;

import Guia9Ejercicio3.Entidades.ArregloReales;
import Guia9Ejercicio3.Servicios.ArregloRealesService;

public class Main {
    public static void main(String[] args) {
        ArregloRealesService as = new ArregloRealesService();
        ArregloReales a = new ArregloReales("A", 10);
        ArregloReales b = new ArregloReales("B", 20);

        as.inicializarA(a);
        as.mostrar(a);
        System.out.println();
        as.ordenar(a);
        System.out.println();
        as.inicializarB(a, b);
        as.mostrar(a);
        System.out.println();
        as.mostrar(b);
    }
}
