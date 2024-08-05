
package com.mycompany.tvproyecto;

/**
 *
 * @author Christopher
 * 2- Crear una clase Prueba (Archivo Prueba.java) con el método main donde:
•	Debe crear 3 instancias de la clase Tv.
•	Debe asignar valores a cada uno de sus atributos.
•	Debe invocar cada uno de sus métodos.

 */
public class Prueba {
    public static void main(String[] args) {
     
        Tv tv1 = new Tv("Samsung", "QLED", 55);
        Tv tv2 = new Tv("LG", "OLED", 65);
        Tv tv3 = new Tv("Sony", "Bravia", 75);

       
        System.out.println("Estado inicial de las TV:");
        tv1.imprimirEstado();
        tv2.imprimirEstado();
        tv3.imprimirEstado();

        System.out.println("\nEncendiendo las TV:");
        tv1.encender();
        tv2.encender();
        tv3.encender();

        System.out.println("\nApagando las TV:");
        tv1.apagar();
        tv2.apagar();
        tv3.apagar();

        
    }
}
    
    
