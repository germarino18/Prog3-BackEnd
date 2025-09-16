package org.example.ColeccionesTP3;


import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        HashMap<String, Curso> cursos = new HashMap<>();
        cursos.put("001", new Curso("Fisica","Gonzalo Malon"));
        cursos.put("002", new Curso("Matematica","Federico Perez"));
        cursos.put("003", new Curso("Quimica","Mauricio Castillo"));

        String codigoBuscado = "002";
        Curso cursoBuscado = cursos.get(codigoBuscado);
        System.out.println("Curso con codigo " + codigoBuscado + ": " + cursoBuscado);

        for (Map.Entry<String, Curso> entry : cursos.entrySet()){
            System.out.println("Codigo: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
