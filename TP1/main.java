package TP1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("German", 22, "Programacion"));
        estudiantes.add(new Estudiante("Jose", 32, "Ingenieria en Sistemas"));
        estudiantes.add(new Estudiante("Martina", 19, "Profesorado de Educación Física"));

        System.out.println(estudiantes);
    }
}
