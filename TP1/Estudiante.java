package TP1;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private String carrera;

    //Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }


    //Getter y Setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString(){
        return "Estudiante{" +
                "nombre='" + getNombre() +
                "' , edad=" + getEdad() +
                ", carrera='" + carrera + "'}";
    }
}

