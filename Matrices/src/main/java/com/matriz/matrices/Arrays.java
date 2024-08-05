
package com.matriz.matrices;

/**
 *
 * @author Tenza
 */
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args){
    
     //Declarar e inicializar un arreglo de listas
    ArrayList<String>[] ListaNombres = new ArrayList[3];
    
    
    // inicializar cada lista del arreglo
    for (int i = 0; i < ListaNombres.length; i++){
    ListaNombres[i] = new ArrayList<>();
    }
    
    //Agregar Elementos a las listas
ListaNombres[0].add("Juan");
ListaNombres[0].add("Maria");    
ListaNombres[1].add("Pedro");    
ListaNombres[1].add("Ana");    
ListaNombres[2].add("Carlos");    
ListaNombres[2].add("Isabel");  

//recorrer el arreglo de listas y mostrar sus Elementos

for (int i = 0; i < ListaNombres.length; i++) {
System.out.println("Lista " + (i + 1) + ":");
for (String nombre : ListaNombres[i]){
System.out.println(nombre);


}
}


}
    }

