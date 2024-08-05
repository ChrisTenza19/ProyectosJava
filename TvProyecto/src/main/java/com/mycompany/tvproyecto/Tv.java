
package com.mycompany.tvproyecto;

/**
 *
 * @author Christopher
 * 1- Crear la clase Tv y agregar al menos 4 atributos y cuatro métodos. (Archivo Tv.Java)
 */
public class Tv {
    
   
    public boolean encendida;
    public int pulgadas;
    public String marca;
    public String modelo;

   
    public Tv(String marca, String modelo, int pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.encendida = false; 
    }

    /*
     En cada método debe imprimir la acción que se está realizando dentro del 
    método tal y como se explicá en el vídeo de la clase virtual de la lección. 
    
    */
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La TV ha sido encendida.");
        } else {
            System.out.println("La TV ya está encendida.");
        }
        imprimirEstado();
    }

    
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La TV ha sido apagada.");
        } else {
            System.out.println("La TV ya está apagada.");
        }
        imprimirEstado();
    }

   

    public void imprimirEstado() {
        System.out.println("Informacion actual de la TV:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Encendida: " + (encendida ? "Si" : "No"));
    }
}