package com.mycompany.retornador;

/**
 *
 * @author Tenza
 */
public class Retornador {

    public static void main(String[] args) {
     int resultado = sumar(0,0);
     System.out.println("Resultado:" + resultado);
    }
    
    public static int sumar (int a, int b) {
    if(a== 0 && b == 0){
    System.out.println("Puede Proporcionar Valores Distintos a cero");
    return 0;
    }
    
    return a + b;
    }
}
