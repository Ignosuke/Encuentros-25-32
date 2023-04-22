package Guia9Ejercicio3.Servicios;

import java.util.Arrays;
import java.util.Collections;
import Guia9Ejercicio3.Entidades.ArregloReales;

public class ArregloRealesService {
    public void inicializarA(ArregloReales a) {
        for (int i = 0; i < a.getArr().length; i++) {
            a.getArr()[i] = (Math.random()*100+1);  //IMPORTANTE. Usar el GETarreglo y no el SETarreglo
        }

        // for (int i = 0; i < a.getArr().length; i++) {  test para ver si se carga
        //     System.out.println(a.getArr()[i]);
        // }
    }

    public void mostrar(ArregloReales n) {
        for (int i = 0; i < n.getArr().length; i++) {
            System.out.print("[" + n.getArr()[i] + "]");
        }
    }

    public void ordenar(ArregloReales n) {
        Arrays.sort(n.getArr(), Collections.reverseOrder());
    }

    public void inicializarB(ArregloReales a, ArregloReales b) {
        for (int i = 0; i < 10; i++) {
            b.getArr()[i] = a.getArr()[i];
        }
        Arrays.fill(b.getArr(), 10, b.getArr().length, 0.5);
    }
}
