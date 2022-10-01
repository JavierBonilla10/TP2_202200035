/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class DecimalBinario {
    int decimal;
    
    public DecimalBinario(){
        decimal = 0;
    }
    
    String ConvertirBinario (int decimal) {
        //Bendecidas sean las librerias
        String binario = Integer.toString(decimal, 2);
        System.out.println(binario);
        return binario;
    }
    
}
