package Guia9Ejercicio2.Entidades;

public class ParDeNumeros {
    private double a, b;

    public ParDeNumeros() {
        this.a = Math.random()*9+1;
        this.b = Math.random()*9+1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
