/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2;
import java.util.Scanner;
     

//Clases
import com.mycompany.tarea2.Area;
import com.mycompany.tarea2.PrimoONo;
import com.mycompany.tarea2.Factorial;
import com.mycompany.tarea2.DecimalBinario;
import com.mycompany.tarea2.Elevador;
import com.mycompany.tarea2.OrdenarArray;
import com.mycompany.tarea2.SuperMercado;
import com.mycompany.tarea2.ParDoble;
import com.mycompany.tarea2.Divisores;
import com.mycompany.tarea2.Potencia;
import java.util.Arrays;
/**
 *
 * @author Javier
 */
public class Tarea2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion;
        boolean start = true;
        boolean submenu;
        int numero;
        
        while (start) {

            //Menu
            System.out.print("*------------------------------*\n");
            System.out.print("*    Area de una figura -->  1 *\n");
            System.out.print("*    Numero primo o no  -->  2 *\n");
            System.out.print("*    Factorial          -->  3 *\n");
            System.out.print("*    Numero a binario   -->  4 *\n");
            System.out.print("*    Ascensor           -->  5 *\n");
            System.out.print("*    Compra del super   -->  6 *\n");
            System.out.print("*   Ordenar mayor-menor -->  7 *\n");
            System.out.print("*    Par o impar        -->  8 *\n");
            System.out.print("*    Divisores          -->  9 *\n");
            System.out.print("*    Potencia           --> 10 *\n");
            System.out.print("*  Ingrese un numero distinto  *\n");
            System.out.print("*  a los anteriores --> salir  *\n");
            System.out.print("*------------------------------*\n");

            System.out.print("Ingrese su eleccion: ");
            eleccion = sc.nextInt();
        
            switch (eleccion) {

                //Ejercicio1 - Area
                case 1:
                    submenu = true;
                    
                    while (submenu) {
                        //Submenu
                        System.out.print("*------------------------------*\n");
                        System.out.print("*    Area de un circulo -->  1 *\n");
                        System.out.print("*  Area de un cuadrado  -->  2 *\n");
                        System.out.print("* Area de un rectangulo -->  3 *\n");
                        System.out.print("*   Volver al menu principal   *\n");
                        System.out.print("*      ingrese    -->    0     *\n");
                        System.out.print("*------------------------------*\n");
                        System.out.print("Ingrese su eleccion: ");

                        eleccion = sc.nextInt();

                        Area area = new Area();
                        double radio, base, altura;
                  
                            switch (eleccion) {

                                case 1:
                                    System.out.print("Ingrese el radio: ");
                                    radio = sc.nextDouble();
                                    System.out.print("El area del circulo es: " + area.AreaCirculo(radio) + "\n");
                                    break;
                                case 2:
                                    System.out.print("Ingrese el lado: ");
                                    base = sc.nextDouble();
                                    System.out.print("El area del cuadrado: " + area.AreaCuadrado(base) + "\n");
                                    break;
                                case 3:
                                    System.out.print("Ingrese la base: ");
                                    base = sc.nextDouble();
                                    System.out.print("Ingrese la altura: ");
                                    altura = sc.nextDouble();
                                    System.out.print("El area del triangulo es: " + area.AreaTriangulo(base, altura) + "\n");
                                    break;
                                default:
                                    submenu = false;
                                    break;
                            }
                    }                  
                    break;  
                    
                //Ejercicio2 - Es primo o no    
                case 2:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*         Es primo o no?       *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingresa un numero: ");
                    numero = sc.nextInt();
                    PrimoONo primoONo = new PrimoONo();
                    
                    if (primoONo.EsPrimoONo(numero) == 1){
                        System.out.print("true\n");
                    }
                    else{
                        System.out.print("false\n");
                    }
                    
                    break;
                
                //Ejercicio3 - Calculo de factorial    
                case 3:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*     Calculo de factorial     *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingresa un numero: ");
                    double facto = sc.nextDouble();
                    
                    Factorial factorial = new Factorial();
                    System.out.print("El factorial de "+ facto +" es " +factorial.facto(facto)+ "\n");         
                    break;
                
                //Ejercicio4 - Decimal a binario    
                case 4:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*           Convertir          *\n");
                    System.out.print("*       Decimal a binario      *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingresa un numero: ");
                    int decimal = sc.nextInt();
                    
                    DecimalBinario decimalBinario = new DecimalBinario();
                    System.out.print("La conversion de " +decimal+ " a binario es " +decimalBinario.ConvertirBinario(decimal) + "\n");
                    
                    break;
                //Ejercicio5 - Elevador
                case 5:
                    submenu = true;
                    while(submenu){
                        System.out.print("*------------------------------*\n");
                        System.out.print("*     A que piso desea ir      *\n");
                        System.out.print("*         Salir --> 0       *\n");
                        System.out.print("*------------------------------*\n");
                        System.out.print("Ingresa un piso: ");
                        int piso = sc.nextInt();                       
                        
                        while (piso != 0) {
                            Elevador elevador = new Elevador();
                            elevador.Subir(piso);
                            System.out.print("Ingresa un piso: ");
                            piso = sc.nextInt();
                        }                        
                    }
                    break;

                //Ejercicio6 - Descuento de superMercado
                case 6:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*  Descuento de SuperMercado   *\n");
                    System.out.print("*------------------------------*\n");
                    String categoriaProducto, cliente;
                    String opcion ="";;
                    double precio, totalDesc, totalCant;
                    int cantidadProducto;
                    totalCant = 0;
                    totalDesc = 0;

                    System.out.println("Ingreso el nombre del producto");
                    categoriaProducto= sc.next();
                    System.out.println("Ingreso el precio del producto");
                    precio = sc.nextDouble();
                    System.out.println("Ingreso la cantidad");
                    cantidadProducto =sc.nextInt();
                    

                    System.out.println("Ingreso el nombre del cliente");
                    cliente = sc.next();
                    System.out.println("Ingrese el nombre de la sección de productos");  
                    opcion = sc.next();

                    SuperMercado superMercado = new SuperMercado();

                    
                    switch(opcion) {
                    case "frutas":
                        superMercado.Descuento(categoriaProducto, precio, totalDesc, totalCant, cantidadProducto);
                        break;
                    case "verduras":  
                        superMercado.Descuento(categoriaProducto, precio, totalDesc, totalCant, cantidadProducto);
                        break;
                    case "abarrotes":  
                        superMercado.Descuento(categoriaProducto, precio, totalDesc, totalCant, cantidadProducto);
                        break;
                    }

                    break;

                //Ejercicio7 - Ordenar Array
                case 7:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*     Ordenador de array       *\n");
                    System.out.print("*------------------------------*\n");

                    OrdenarArray ordenarArray = new OrdenarArray();
                    int vector[] = {6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 022, 95};
                    ordenarArray.Burbuja(vector);
                    System.out.print(Arrays.toString(vector)+ "\n");
                    break;
                
                //Ejercicio8 - Par doble impar trible
                case 8:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*      Par sera un doble       *\n");
                    System.out.print("*      Impar sera triple       *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingrese un numero: ");
                    numero = sc.nextInt();
                    
                    ParDoble parDoble = new ParDoble();
                    System.out.print(parDoble.ParImpar(numero));
                    break;

                    //Ejercicio9 - Divisores de un numero
                case 9:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*      Ingrese un numero       *\n");
                    System.out.print("*          de 1 a 1000         *\n");
                    System.out.print("*  Para mostrar sus divisores  *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingrese un numero: ");
                    numero = sc.nextInt();
                    
                    Divisores divisores = new Divisores();
                    System.out.print("Los divisores de " +numero+ " son: "+ divisores.DivisoresNumero(numero) +"\n");
                    break;

                    //Ejercicio10 - Potencia
                case 10:
                    System.out.print("*------------------------------*\n");
                    System.out.print("*     Ingrese dos numero       *\n");
                    System.out.print("*       base de 1 a 10         *\n");
                    System.out.print("*      exponente de 1 a 4      *\n");
                    System.out.print("*------------------------------*\n");
                    System.out.print("Ingrese la base: ");
                    int base = sc.nextInt();
                    submenu = true;
                    
                    while (submenu){
                        if (base >= 1 && base <= 10) {
                            System.out.print("Ingrese el exponente: ");
                            int exponente = sc.nextInt();
                            
                            if (exponente >= 1 && exponente <= 4) {
                                Potencia potencia = new Potencia();
                                 System.out.print(potencia.Potenciador(base, exponente));
                                 submenu = false;
                            }
                            else {
                                System.out.print("Ingrese el exponente: ");
                                exponente = sc.nextInt();
                            }
                        }
                        else {
                            System.out.print("Ingrese la base: ");
                            base = sc.nextInt();          
                        }
                    }
                default:
            }
        
        
             
        
        } 
        
        
    }
}
