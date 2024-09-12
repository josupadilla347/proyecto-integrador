package com.example;

import java.util.ArrayList;

public class Tienda {
private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; 
    }

    public double calcularValorTotalInventario() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getStock();
        }
        return total;
    }

    public void mostrarProductosConStockBajo(int limite) {
        for (Producto producto : productos) {
            if (producto.getStock() < limite) {
                System.out.println(producto);
            }
        }
    }
}

