package org.example.ColeccionesTP2;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();
        productos.add(new Producto("PC de escritorio", "001"));
        productos.add(new Producto("Notebook", "002"));
        productos.add(new Producto("PC gamer", "001"));

        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}
