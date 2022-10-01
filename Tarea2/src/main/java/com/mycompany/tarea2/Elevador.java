/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class Elevador {
    int piso;
    
    public Elevador (){
    piso = 0;
    }
    
    //no le se aplicar la logica aqui (creo que no se puede)
    public void Subir (int piso){
        for(int i = 1; i<=piso; i++){
            System.out.print("Piso " + i + "\n");
    }
        
    }
    
}
