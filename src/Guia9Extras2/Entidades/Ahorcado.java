package Guia9Extras2.Entidades;

public class Ahorcado {
    private String palabra;
    private char[] letras = new char[palabra.length()];
    private int encontradas, intentos;

    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        letras = this.palabra.toCharArray();
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public int getIntentos() {
        return intentos;
    }
}
