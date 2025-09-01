package org.example.ACT2;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Estudiante extends Persona{
    private String carrera;


    @Override
    public String toString(){
        return super.toString() +
                " carrera='" + carrera +
                "'}";
    }
}
