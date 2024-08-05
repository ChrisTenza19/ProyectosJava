

package com.mycompany.calculadora;

/**
 *
 * @author Christopher
 * 
 * Crear una clase Calculadora (Calculadora.java) con los métodos sumar, 
 * restar, multiplicar y dividir que reciba dos parámetros enteros y retorne
 * el resultado (utilizar la palabra reservada return).
 */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    
    public int restar(int a, int b) {
        return a - b;
    }

   
    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    
    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    
    public int multiplicar(int a, int b) {
        return a * b;
    }

    
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }


    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division por cero no permitida.");
            return 0; 
        }
        return a / b;
    }

    /*
    Sobrecargar los métodos sumar, restar y multiplicar (no el dividir) para que reciba 
    tres parámetros enteros y retorne el resultado (utilizar la palabra reservada return).
Sobrecargar los métodos sumar, restar y multiplicar (no el dividir) para que reciba cuatro
    parámetros enteros enteros y retorne el resultado (utilizar la palabra reservada return).
    */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1 = 10;
        int num2 = 5;
        int num3 = 2;
        int num4 = 1;

     
        System.out.println("Suma (2 parametros): " + calc.sumar(num1, num2));
        System.out.println("Resta (2 parametros): " + calc.restar(num1, num2));
        System.out.println("Multiplicacion (2 parametros): " + calc.multiplicar(num1, num2));
        System.out.println("Division (2 parametros): " + calc.dividir(num1, num2));

        System.out.println("Suma (3 parametros): " + calc.sumar(num1, num2, num3));
        System.out.println("Resta (3 parametros): " + calc.restar(num1, num2, num3));
        System.out.println("Multiplicacion (3 parametros): " + calc.multiplicar(num1, num2, num3));

        System.out.println("Suma (4 parametros): " + calc.sumar(num1, num2, num3, num4));
        System.out.println("Resta (4 parametros): " + calc.restar(num1, num2, num3, num4));
        System.out.println("Multiplicacion (4 parametros): " + calc.multiplicar(num1, num2, num3, num4));
    }

        
    }
