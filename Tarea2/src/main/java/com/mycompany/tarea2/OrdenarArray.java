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
    vector = new int[] {6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 022, 95};
    }
    
   int burbuja(int[] vector) {
    for (int x = 0; x < vector.length; x++) {
        // Aquí "y" se detiene antes de llegar
        // a length - 1 porque dentro del for, accedemos
        // al siguiente elemento con el índice actual + 1
        for (int y = 0; y < vector.length - 1; y++) {
            int elementoActual = vector[y],
                    elementoSiguiente = vector[y + 1];
            if (elementoActual > elementoSiguiente) {
                // Intercambiar
                vector[y] = elementoSiguiente;
                vector[y + 1] = elementoActual;
                }
            }
        }
    }
    
}
