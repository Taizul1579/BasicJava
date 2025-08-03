
package com.mycompany.basicjava;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        int Input;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Factorial No: ");
        Input = input.nextInt();
        for (int i =Input; i>=1; i--){
            
            factorial = factorial*i;
            
        }
        System.out.println("Factorial is: "+factorial);
    }
}
