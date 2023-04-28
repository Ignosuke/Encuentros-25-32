package Guia9Extras2.Entidades;

import java.util.Arrays;

public class Ahorcado {
    private String palabra;
    private char[] letras;
    private String[] aux;
    private int encontradas, faltantes, intentos = 5;

    public Ahorcado(String palabra) {
        this.palabra = palabra;
        letras = this.palabra.toCharArray();
        this.encontradas = 0;
        this.faltantes = palabra.length();
        
        aux = new String[palabra.length()];
        Arrays.fill(aux, "__");
    }

    public String getPalabra() {
        return palabra;
    }

    public char[] getLetras() {
        return letras;
    }

    public String getAux() {
        return Arrays.toString(aux);
    }

    public void setLetraEncontrada(int indice) {
        this.aux[indice] = "" + letras[indice];
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
