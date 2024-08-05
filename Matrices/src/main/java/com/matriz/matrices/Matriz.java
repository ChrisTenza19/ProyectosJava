
package com.matriz.matrices;

/**
 *
 * @author Tenza
 */
public class Matriz {
    public static void main(String[] args){
    
    int [] numeros = {10, 25, 32, 44}; 
    
    for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros [i]);
    } 
    
    System.out.println("El tercer elemento es: " + numeros[2]);
    
    numeros[1] = 50;
    System.out.println("El arreglo se modifico: ");
    for (int i = 0; i < numeros.length; i++){
    System.out.println(numeros[i]);
    }
    
            }
}
