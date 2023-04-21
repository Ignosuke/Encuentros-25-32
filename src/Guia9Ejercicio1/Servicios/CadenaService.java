package Guia9Ejercicio1.Servicios;

import java.util.Arrays;
import java.util.Scanner;

import Guia9Ejercicio1.Entidades.Cadena;

public class CadenaService {
    private Scanner leer = new Scanner(System.in);

    public void contarVocales(Cadena c) {

        int[] vocales = new int[5];

        Arrays.fill(vocales, 0);

        //Hola mundo

        for (int i = 0; i < c.getLongitud(); i++) {
            switch (c.getFrase().toLowerCase().charAt(i)) {
                case 'a':
                    vocales[0]++;
                    break;
                case 'e':
                    vocales[1]++;
                    break;
                case 'i':
                    vocales[2]++;
                    break;
                case 'o':
                    vocales[3]++;
                    break;
                case 'u':
                    vocales[4]++;
                    break;
                default:
            }
        }

        System.out.println("La cantidad de letras a es: " + vocales[0]);  //1
        System.out.println("La cantidad de letras e es: " + vocales[1]);  //0
        System.out.println("La cantidad de letras i es: " + vocales[2]);  //0
        System.out.println("La cantidad de letras o es: " + vocales[3]);  //2
        System.out.println("La cantidad de letras u es: " + vocales[4]);  //1
    }

    public void invertirFrase(Cadena c) {
        String invertido = "";

        for (int i = c.getLongitud()-1; i > -1; i--) {
            invertido += c.getFrase().charAt(i);
        }

        System.out.println("La frase invertida es: \n" + invertido);
    }

    public void vecesRepetido(Cadena c) {
        System.out.println("Ingrese un caracter para contar cuantas veces se repite: ");
        char a = leer.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == a) {
                contador++;
            }
        }

        System.out.println("El caracter " + a + " se repite " + contador + " veces");
    }

    public void compararLongitud(Cadena c) {
        System.out.println("Ingrese una frase para comparar longitudes: ");
        String frase = leer.nextLine();
        if (frase.length() == c.getLongitud()) {
            System.out.println("Ambas frases tienen la misma cantidad de caracteres");
            return;
        } else {
            System.out.println("Las frases tienen longitudes diferentes");
            //System.out.println(c.getLongitud() +  " --- " + frase.length()); muestra longitudes de ambas frases
        }
    }

    public void unirFrases(Cadena c) {
        System.out.println("Ingrese una nueva frase para concatenar: ");
        String frase = leer.nextLine();
        System.out.println(c.getFrase() + " " + frase);  //concateno una variable donde guardo la frase nueva
    }
    
    public void reemplazar(Cadena c) {
        System.out.println("Ingrese el caracter por el cual desea reemplazar las letras a:");
        System.out.println(c.getFrase().replaceAll("a", leer.next()));  //paso como parametro la lectura en vez de declarar una variable
    }

    public void contiene(Cadena c) {
        System.out.println("Ingrese una letra para verificar si existe en la frase:");
        if (c.getFrase().contains(leer.next())) {
            System.out.println("VERDADERO. La frase contiene la letra");
        } else {
            System.out.println("FALSO. La frase no contiene la letra");
        }
    }
}
