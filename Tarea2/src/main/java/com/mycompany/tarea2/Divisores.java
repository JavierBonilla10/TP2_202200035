/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class Divisores {
    int numero;
    String resultado;
    
    public Divisores(){
    numero = 0;
    resultado = "";
    }
    
    String DivisoresNumero(int numero) {
    for(int i = 1 ; i <=numero ; i++){
        if(numero%i==0){
            resultado += " " + i;
        }
    }
        return resultado;
}
    
}
