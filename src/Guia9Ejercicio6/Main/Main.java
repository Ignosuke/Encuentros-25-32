package Guia9Ejercicio6.Main;

import Guia9Ejercicio6.Entidades.Curso;
import Guia9Ejercicio6.Servicios.CursoService;

public class Main {
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso c = cs.crearCurso();
        cs.gananciaSemanal(c);
    }
}
