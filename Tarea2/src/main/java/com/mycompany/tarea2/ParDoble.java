/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class ParDoble {
    int numero;
    String resultado;
    
    public ParDoble(){
    numero = 0;
    resultado = "";
    }
    
    String ParImpar(int numero){
    if (numero % 2 == 0){
        resultado = numero + " es par, su doble es: " + (numero * 2) + "\n";
        return resultado;
    }
    else {
        resultado = numero + " es impar, su triple es: " + (numero * 2) + "\n";
        return resultado;    
    }
    }
    
}
