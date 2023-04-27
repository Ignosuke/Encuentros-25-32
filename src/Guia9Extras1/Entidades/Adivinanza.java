package Guia9Extras1.Entidades;

public class Adivinanza {
    private final String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", 
    "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
    private final String secreto = meses[(int) (Math.random()*11+1)];

    public String[] getMeses() {
        return meses;
    }
    
    public String getSecreto() {
        return secreto;
    }
}
