package com.iudigital.compra.hilos;

import com.iudigital.producto.cliente.producto.ClienteProducto;
import com.iudigital.producto.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajeraThread {

    public static void main(String[] args) {
      List<Producto> productos = new ArrayList<>();
        setproductos (productos);
    
        ClienteProducto cliente1 = new ClienteProducto("jhon", productos);
        ClienteProducto cliente2 = new ClienteProducto("diana", productos);
        
       long tiempoInicial = System.currentTimeMillis();
       CajeraThreadProducto cajera1 = new CajeraThreadProducto("maria", cliente1, tiempoInicial);
       CajeraThreadProducto cajera2 = new CajeraThreadProducto("carolina", cliente2, tiempoInicial);
       
       
      cajera1.start();
      cajera2.start();
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
   
   

