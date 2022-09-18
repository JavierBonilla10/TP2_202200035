/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class Factorial {
    
    double factorial;
    double factCal;
    
    public Factorial(){
        factorial = 0;
        factCal = 1;
    }
    
    double facto(double factorial){
        for(int i=1;i<=factorial;i++){    
            factCal=factCal*i;    
        }
        
        return factCal;
    }
    
}
