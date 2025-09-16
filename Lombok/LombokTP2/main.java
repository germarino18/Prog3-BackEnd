package org.example.LombokTP2;

public class main {
    public static void main(String[] args) {
        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Francisco")
                .email("francisco@mail.com")
                .build();
        System.out.println("ID: " + u1.getId() + ", Nombre: " + u1.getNombre() + ", Email: " + u1.getEmail());
    }
}
