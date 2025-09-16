package org.example.Reflection_GenericosTP3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.guardar("holaaa");
        System.out.println("Caja String: " + cajaString.obtener());

        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.guardar(123);
        System.out.println("Caja Integer: " + cajaInteger.obtener());

        //ejemplo coleccion sin genericos
        List listaSinGenericos = new ArrayList<>();
        listaSinGenericos.add("texto");
        listaSinGenericos.add(123);

        String texto = (String) listaSinGenericos.get(0);
        Integer numero = (Integer) listaSinGenericos.get(1);

        System.out.println("Lista sin genericos: " + texto + ", " + numero);
    }
}
