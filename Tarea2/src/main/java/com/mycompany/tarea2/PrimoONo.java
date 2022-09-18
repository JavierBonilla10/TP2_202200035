/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class PrimoONo {
    int numero;
    
    public PrimoONo(){
        numero = 0;
    }
    
    int EsPrimoONo (int numero){
        if (numero % 2 == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
