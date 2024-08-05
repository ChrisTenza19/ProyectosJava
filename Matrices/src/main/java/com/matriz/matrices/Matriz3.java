
package com.matriz.matrices;

/**
 *
 * @author Tenza
 */
public class Matriz3 {
        public static void main(String[] args){
        int[][] matriz = {
            {1,2,3},
                {4,5,6},
                {7,8,9}  
        };
        
        System.out.println("Recurriendo con bucle for anidado");
            for (int[] matriz1 : matriz) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.println(matriz1[j] + "");
                }
                System.out.println();
            }
        
        System.out.println("\nRecorriendo con bucle forEach");
        for (int[] fila : matriz){
        for (int elemento : fila){
        System.out.println(elemento + "");
        }
        }
        
        System.out.println();
        }

}
