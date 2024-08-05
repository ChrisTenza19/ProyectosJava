/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;

/**
 *
 * 
 */
public class Calculadora {
     public double sumar(double num1, double num2) {
        return num1 + num2;
    }

  
    public double restar(double num1, double num2) {
        return num1 - num2;
    }


    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
}
