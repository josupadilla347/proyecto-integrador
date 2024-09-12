package com.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        Producto p1 = new Producto("Manzana", 1.5, 10);
        Producto p2 = new Producto("Banana", 1.2, 5);
        Producto p3 = new Producto("Pera", 2.0, 20);
        
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);
        
        Producto buscado = tienda.buscarProductoPorNombre("Banana");
        System.out.println("Producto buscado: " + buscado);
        
        double valorTotal = tienda.calcularValorTotalInventario();
        System.out.println("Valor total del inventario: $" + valorTotal);
        
        System.out.println("Productos con stock bajo:");
        tienda.mostrarProductosConStockBajo(10);
    }
}