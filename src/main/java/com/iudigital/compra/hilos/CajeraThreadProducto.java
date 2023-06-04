package com.iudigital.compra.hilos;

import com.iudigital.producto.cliente.producto.ClienteProducto;
import com.iudigital.producto.cliente.producto.Producto;

public class CajeraThreadProducto extends Thread {  
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    CajeraThreadProducto(String maria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run() {
        System.out.println(" La cajera " + this.nombre 
               + " Comienza a procesar la compra del cliente " + cliente.getNombre() 
               + " en el tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 
               + "seg");
       
        int contCliente = 1; 
        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println( " Procesado el producto " + contCliente
                    + " nombre producto " + producto.getNombre()
                    + " presio producto " + producto.getPresio() 
                    + " cantidad de productos " + producto.getCantidad()
                    + "costo total del producto " 
                    + producto.getCantidad() * producto.getPresio()
                    + " Tiempo " + (System.currentTimeMillis() - this.tiempoInicial ) / 1000
                    + " seg ");
        }
        System.out.println(" La cajera " + this.nombre + " ha terminado e procesar " 
                + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - this.tiempoInicial ) / 1000
                    + " seg ");
    }
   
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex)   {
            Thread.currentThread().interrupt(); 
            
        }
    }
} 
 
    

