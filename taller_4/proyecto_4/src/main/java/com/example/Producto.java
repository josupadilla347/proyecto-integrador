package com.example;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public void actualizarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: La cantidad no puede ser negativa.");
        } else {
            this.stock = cantidad;
        }
    }

    public double calcularPrecioTotal() {
        return precio * stock;
    }


}

