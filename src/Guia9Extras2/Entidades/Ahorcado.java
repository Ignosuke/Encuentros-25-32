package Guia9Extras2.Entidades;

public class Ahorcado {
    private String palabra;
    private char[] letras;
    private int encontradas, faltantes, intentos;

    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        letras = this.palabra.toCharArray();
        this.intentos = intentos;
        this.encontradas = 0;
        this.faltantes = palabra.length();
    }

    public String getPalabra() {
        return palabra;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetraEncontrada(int indice) {
        this.letras[indice] = '@';
    }

    public int getEncontradas() {
        return encontradas;
    }    

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getFaltantes() {
        return faltantes;
    }
    
    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}
