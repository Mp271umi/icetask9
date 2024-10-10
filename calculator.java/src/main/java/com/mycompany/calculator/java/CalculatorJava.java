/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator.java;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class CalculatorJava {
   
    public static void main(String[] args) {
   Calculator calculator = new Calculator();
     double num1 =Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
     double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));
     
     int choice;
      do{
          choice=
       Integer.parseInt(JOptionPane.showInputDialog("choose uparation: \n1.Addition\n2. Subtraction\n3.Division\n4. Multiplication\n5. Exit"));
                   switch (choice){
               case 1 -> JOptionPane.showMessageDialog(null, "Result:" + calculator.add(num1,num2));
               case 2 -> JOptionPane.showMessageDialog(null,"Result:" + calculator.subtraction(num1,num2));
               case 3 -> JOptionPane.showMessageDialog(null,"Result" + calculator.division(num1,num2));
               case 4 -> JOptionPane.showMessageDialog(null,"Results" + calculator.multiplication(num1,num2));
               case 5 -> JOptionPane.showMessageDialog(null,"Existig...");
               default -> JOptionPane.showMessageDialog(null,"Invalid choice.Please choose a valid operation.");
                }
      }while (choice !=5);
      
    }
}
