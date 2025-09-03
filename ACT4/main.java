package org.example.ACT4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto(01,"Chocolate",1500.00);
        Producto p2 = new Producto(02,"Alfajor",1700.00);
        Producto p3 = new Producto(01, "Chocolate blanco",1500.00);

        if (!productos.contains(p1)){
            productos.add(p1);
        }
        if (!productos.contains(p2)) {
            productos.add(p2);
        }
        if (!productos.contains(p3)) {
            productos.add(p3);
        }

        for (Producto p : productos){
            System.out.println(p);
        }
    }
}
