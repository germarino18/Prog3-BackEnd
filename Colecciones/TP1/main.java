package org.example.Colecciones.TP1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Diego", 67));
        alumnos.add(new Alumno("Pedro", 89));
        alumnos.add(new Alumno("Julieta", 97));

        for (Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }
}
