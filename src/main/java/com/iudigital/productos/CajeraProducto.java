package com.iudigital.productos;

import com.iudigital.producto.cliente.producto.ClienteProducto;
import com.iudigital.producto.cliente.producto.Producto;

public class CajeraProducto {
   
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;  
        
    }
    
   public void procesarCompra (ClienteProducto cliente, long timeStamp){
       
       System.out.println(" La cajera " + this.nombre 
               + " Comienza a procesar la compra del cliente " + cliente.getNombre() 
               + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 
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
                    + " Tiempo " + (System.currentTimeMillis() - timeStamp ) / 1000
                    + " seg ");
        }
        System.out.println(" La cajera " + this.nombre + " ha terminado e procesar " 
                + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - timeStamp ) / 1000
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
