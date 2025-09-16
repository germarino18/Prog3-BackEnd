package org.example.LombokTP1;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("German", 23);
        System.out.println("Nombre: " + p1.getNombre() + ", Edad: " + p1.getEdad());

        Persona p2 = new Persona();
        p2.setNombre("Carlos");
        p2.setEdad(26);
        System.out.println("Nombre: " + p2.getNombre() + ", Edad: " + p2.getEdad());
    }
}
