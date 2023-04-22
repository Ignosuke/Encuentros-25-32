package Guia9Ejercicio3.Entidades;

public class ArregloReales {
    private String nombre;
    private int cantidadElementos;
    private Double[] arr;

    public ArregloReales(String nombre, int cantidadElementos) {
        this.nombre = nombre;
        this.cantidadElementos = cantidadElementos;
        this.arr = new Double[cantidadElementos];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public Double[] getArr() {
        return arr;
    }

    public void setArr(Double[] arr) {
        this.arr = arr;
    }    
}
