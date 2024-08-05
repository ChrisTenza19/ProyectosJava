
package com.matriz.matrices;



/**
 *
 * @author Tenza
 */
public class Matriz2 {
    public static void main(String[] args){
    int[] numeros = {10, 25, 32, 44};
    
    int longitud = numeros.length;
    System.out.println("El tamano del arreglo es: " + longitud);
    
    int valorABuscar = 32;
    boolean encontrado = false;
    for (int i = 0; i < numeros.length; i++){
    if (numeros[i] == valorABuscar){
        encontrado = true;
        break;
    }
    }
    
    if (encontrado) {
    System.out.println("El elemento " + valorABuscar + " si se encuentra en el arreglo.");
    }
    else {
    System.out.println("El elemento " + valorABuscar + " no se encuentra en el arreglo.");
    }
   
    System.out.println("Arreglo ordenado:");
    for (int i = 0; i < numeros.length; i++){
    System.out.println(numeros[i]);
    }
    }
  
}
