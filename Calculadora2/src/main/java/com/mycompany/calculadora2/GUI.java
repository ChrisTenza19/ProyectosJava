/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * 
 */
public class GUI {
     private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;
    private Calculadora calculadora;
    
    public GUI() {
      
        calculadora = new Calculadora();

        
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        
        textField1 = new JTextField();
        textField1.setBounds(50, 50, 100, 30);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(200, 50, 100, 30);
        frame.add(textField2);

        sumButton = new JButton("Sumar");
        sumButton.setBounds(50, 100, 100, 30);
        frame.add(sumButton);

        subtractButton = new JButton("Restar");
        subtractButton.setBounds(200, 100, 100, 30);
        frame.add(subtractButton);

        multiplyButton = new JButton("Multiplicar");
        multiplyButton.setBounds(50, 150, 100, 30);
        frame.add(multiplyButton);

        divideButton = new JButton("Dividir");
        divideButton.setBounds(200, 150, 100, 30);
        frame.add(divideButton);

        resultLabel = new JLabel("Resultado: ");
        resultLabel.setBounds(50, 200, 250, 30);
        frame.add(resultLabel);

        
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("sumar");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("restar");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("multiplicar");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("dividir");
            }
        });

     
        frame.setVisible(true);
    }

    private void realizarOperacion(String operacion) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double resultado = 0;

            switch (operacion) {
                case "sumar":
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case "restar":
                    resultado = calculadora.restar(num1, num2);
                    break;
                case "multiplicar":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "dividir":
                    resultado = calculadora.dividir(num1, num2);
                    break;
            }

            resultLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}

