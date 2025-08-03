/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.basicjava;

import java.util.Scanner;


public class SumOfTwoNumberUsingUserInput {
    public static void main(String[] args) {
        
        // define variable
        int Number1,Number2,Sum;
        //user input
        Scanner Number = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        Number1 = Number.nextInt();
        
        System.out.print("Enter Second Number: ");
        Number2 = Number.nextInt();
        
        Sum = Number1 + Number2;
        System.out.println("Result is: "+Sum);
        
        
                
        
        
     }
            
    
}
                                                     