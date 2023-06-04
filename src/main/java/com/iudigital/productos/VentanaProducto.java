package com.iudigital.productos;

import com.iudigital.producto.cliente.producto.ClienteProducto;
import com.iudigital.producto.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class VentanaProducto {

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setproductos (productos);
    
        ClienteProducto cliente1 = new ClienteProducto("jhon", productos);
        ClienteProducto cliente2 = new ClienteProducto("diana", productos);
        
       long inicalTime = System.currentTimeMillis();
       CajeraProducto cajera1 = new CajeraProducto("maria");
       CajeraProducto cajera2 = new CajeraProducto("carolina");
       
       
       cajera1.procesarCompra(cliente1, inicalTime);
       cajera2.procesarCompra(cliente2, inicalTime);
    } 
    
    private static void setproductos(List<Producto> productos) {
       Producto Producto1 = new Producto("arroz", 20, 3);
       Producto Producto2 = new Producto("azucar", 10, 1);
       Producto Producto3 = new Producto("cafe", 5, 5);
       
       productos.add(Producto1);
       productos.add(Producto2);
       productos.add(Producto3);
       
    }       
 }
