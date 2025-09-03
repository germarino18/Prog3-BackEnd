package org.example.ACT4;


import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args){
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto(01,"Chocolate",1500.00));
        productos.add(new Producto(02,"Yogurt",2000.00));
        productos.add(new Producto(01,"Chocolate blanco",1500.00));

        for (Producto p : productos){
            System.out.println(p);
        }
    }
}
