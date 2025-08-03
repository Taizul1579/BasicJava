
package com.mycompany.basicjava;
import java.util.Scanner;

public class MultiplicationOfTwoNumber {
    public static void main(String[] args) {
        //define variable
        int Number1,Number2,Result;
        //user input
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        Number1 = Number.nextInt();
        System.out.print("Enter Second Number: ");
        Number2 = Number.nextInt();
        
        Result = Number1 * Number2;
        System.out.print("Result is: "+Result);
         
         
    }
    
}
