package com.mycompany.calculator.java;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Calculator {
     public double add(double num1, double num2) {
                return num1 + num2;
            }
            public double subtraction(double num1, double num2){
                  return num1 - num2;
            }
             public double division(double num1, double num2){
                  if(num2 == 0){
                      JOptionPane.showMessageDialog(null,"error: division by zero!");
                      return 0;
             }
                  return num1 / num2;
             }
               public double multiplication(double num1, double num2){
                   return num1 * num2;
             }
}
