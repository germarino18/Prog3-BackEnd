package org.example.ACT3;

import lombok.*;
import org.example.ACT2.Estudiante;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter


public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes = new ArrayList<>();

    //Constructor
    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public Curso(){}

    public void agregarEstudiante(Estudiante e){
        listaDeEstudiantes.add(e);
    }

    @Override
    public String toString(){
        return "Curso: " + nombre + "\n" +
                "Profesor: " + profesor + "\n" +
                "Cantidad de alumnos: " + listaDeEstudiantes.size();

    }
}
