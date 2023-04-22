package Guia9Ejercicio2.Servicios;

import Guia9Ejercicio2.Entidades.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarNumeros(ParDeNumeros p) {
        System.out.println("Los numeros son:");
        System.out.println("A: " + p.getA());
        System.out.println("B: " + p.getB());
    }

    public double devolverMayor(ParDeNumeros p) {
        // System.out.println("El numero mayor es: " + Math.max(p.getA(), p.getB()));
        return Math.max(p.getA(), p.getB());
    }

    public double devolverMenor(ParDeNumeros p) {
        // System.out.println("El numero menor es: " + Math.max(p.getA(), p.getB()));
        return Math.min(p.getA(), p.getB());
    }

    public void calcularPotencia(ParDeNumeros p) {
        int mayor = (int) devolverMayor(p), menor = (int) devolverMenor(p);
        System.out.println("La potencia del mayor elevado al menor es: ");
        System.out.println(Math.pow(mayor, menor));
    }

    public void calcularRaiz(ParDeNumeros p) {
        int menor = (int) devolverMenor(p);
        System.out.println("La raiz cuadrada del menor es: ");
        System.out.println(Math.sqrt(Math.abs(menor)));
    }
}
