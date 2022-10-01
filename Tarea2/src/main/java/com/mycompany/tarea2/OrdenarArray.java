/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class OrdenarArray {
    int[] vector;

    
    public OrdenarArray(){
    vector = new int[] {0};
    }
    
   
    public void Burbuja(int[] vector) {
        for (int x = 0; x < vector.length; x++) {
            for (int y = 0; y < vector.length - 1; y++) {
                int elementoActual = vector[y],
                elementoSiguiente = vector[y + 1];
                if (elementoActual > elementoSiguiente) {
                    vector[y] = elementoSiguiente;
                    vector[y + 1] = elementoActual;
                }
            }
        }
    }
}


   
