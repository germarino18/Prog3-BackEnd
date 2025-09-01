package org.example.ACT2;

import org.example.ACT3.Curso;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante p1 = Estudiante.builder()
                .nombre("German")
                .edad(23)
                .carrera("Programación")
                .build();

        Estudiante p2 = Estudiante.builder()
                .nombre("Carlos")
                .edad(26)
                .carrera("Ingeniero en Sistemas")
                .build();

        Estudiante p3 = Estudiante.builder()
                .nombre("Franchesca")
                .edad(20)
                .carrera("Profesorado de educación física")
                .build();

        estudiantes.add(p1);
        estudiantes.add(p2);
        estudiantes.add(p3);

        System.out.println(estudiantes);

        Curso curso1 = new Curso("Base de datos","Ernesto Ruiz");
        curso1.agregarEstudiante(p1);
        curso1.agregarEstudiante(p2);
        curso1.agregarEstudiante(p3);

        Curso curso2 = new Curso("Programación", "Fabian Rodriguez");
        curso2.agregarEstudiante(p1);
        curso2.agregarEstudiante(p2);
        curso2.agregarEstudiante(p3);

        System.out.println(curso1);
        System.out.println("-----------");
        System.out.println(curso2);
    }
}
