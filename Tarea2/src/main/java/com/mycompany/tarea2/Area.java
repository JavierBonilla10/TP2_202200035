/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Javier
 */
public class Area {
    public double radio;
    public double base;
    public double altura;
    
    public Area(){
        radio = 0;
        radio = 0;
        radio = 0;
    }
    
    double AreaCirculo(double radio){
    return (Math.pow(radio,2)*Math.PI);
    }
    
    double AreaCuadrado(double base){
    return (Math.pow(base,2));
    }
    
    double AreaTriangulo(double base, double altura){
    return (base * altura) / 2;
    }
}
