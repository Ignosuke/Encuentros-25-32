package Guia9Ejercicio1.Main;

import Guia9Ejercicio1.Entidades.Cadena;
import Guia9Ejercicio1.Servicios.CadenaService;

public class Main {
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena c = new Cadena("Hola mundo");

        cs.contarVocales(c);
        System.out.println();
        cs.invertirFrase(c);
        System.out.println();
        cs.vecesRepetido(c);
        System.out.println();
        cs.compararLongitud(c);
        System.out.println();
        cs.unirFrases(c);
        System.out.println();
        cs.reemplazar(c);
        System.out.println();
        cs.contiene(c);

    }
}
