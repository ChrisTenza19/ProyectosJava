
package com.matriz.matrices;

/**
 *
 * @author Tenza
 */
import java.util.HashMap;
import java.util.Map;

public class Matriz4 {
    
     public static void main(String[] args){
     
         Map<String, Integer> estudiantes = new HashMap<>();
         
         
         estudiantes.put("Juan", 32);
         estudiantes.put("Maria", 28);
         estudiantes.put("Pedro", 35);
         estudiantes.put("Ana", 27);
                 
         System.out.println("Juan esta en el mapa? " + estudiantes.containsKey("Juan"));
         
         System.out.println("Edad de Juan: " + estudiantes.get("Juan"));
         
         for (Map.Entry<String, Integer> entrada : estudiantes.entrySet()){
         System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
         }
         
         estudiantes.remove("Ana");
         System.out.println("Mapa despues de eliminar a Ana: ");
         for (Map.Entry<String, Integer> entrada : estudiantes.entrySet()){
         System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
         }
         
         
         
         
         
         
     }
}
