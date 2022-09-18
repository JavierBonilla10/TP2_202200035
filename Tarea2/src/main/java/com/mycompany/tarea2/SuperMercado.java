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
    String listaDescuento[];
    String listaPrecio[];
    String compra[];
    listaDescuento = new String[5];    

    
    public SuperMercado(){
    listaDescuento = new String[] {"Manzana","Naranja","Pepino","Azucar","Jabon"};    
    listaPrecio = new String[] {"Q10.50","Q5.50","Q7.00","Q45.50","Q30"};
    compra = new String[5];
    }
    
    String Descuento(String compra){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                listaDescuento[j];
                if(listaDescuento[i] == compra[j]){
                
                }
            }
        }
    }
    
}
