/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class SuperMercado {
    String categoriaProducto, opcion;
    double precio, totalDesc, totalCant;
    int cantidadProducto;
    
    public SuperMercado(){
    categoriaProducto = "";
    precio = 0;
    totalDesc = 0;
    totalCant = 0;
    cantidadProducto = 0;
    }
    
    public void Descuento(String categoriaProducto, double precio, double totalDesc, double totalCant, int cantidadProducto){
        totalCant = precio * cantidadProducto;
        System.out.println("El total es : "+totalCant);
        if(totalCant > 1000){
            System.out.println("El descuento es ; "+totalCant*0.20);
        totalDesc = totalCant - (totalCant*0.20);
            System.out.println("El neto a pagar es : "+totalDesc);
        }else{ 
            System.out.println("No hay descuentos");
        }
    }
    

    
    
}