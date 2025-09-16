package org.example.LombokTP4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Productos p1 = new Productos("Tablet", "2345", "Samoa", 1000.0);
        Productos p2 = new Productos("Notebook", "5789", "Acer", 1800.0);

        ProductosRecord r1 = new ProductosRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductosRecord r2 = new ProductosRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());


        List<ProductosRecord> listaRecords = new ArrayList<>();
        listaRecords.add(r1);
        listaRecords.add(r2);

        System.out.println("Lista de Productos");
        for (ProductosRecord r : listaRecords) {
            System.out.println(r);
        }
    }
}
