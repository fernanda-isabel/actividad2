package com.iudigital.producto.cliente.producto;

public class Producto {
    
    private String nombre;
    private float presio;
    private int cantidad;

    public Producto(String nombre, float presio, int cantidad) {
        this.nombre = nombre;
        this.presio = presio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresio() {
        return presio;
    }

    public void setPresio(float presio) {
        this.presio = presio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
