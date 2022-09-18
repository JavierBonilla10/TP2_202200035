/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class Potencia {
    int base;
    int exponete;
    String resultado;
    
    public Potencia(){
    base = 0;
    exponete = 0;
    resultado = "";
    }
    
    String Potenciador(int base, int exponente){
        resultado = "La potencia de " +base+ "^" +exponente+ " es : " +(Math.pow(base, exponente))+ "\n";
                
        return resultado;
    }
    
}
