
package com.mycompany.basicjava;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Digit: ");
        digit = input.nextInt();
        switch (digit){
            case 0: 
                System.out.println("ZERO");
                break;
            
            case 1:
                System.out.println("ONE");
                break;
           
            case 2:
                System.out.println("TWO");
                break;
            default:
            System.out.println("Invalid input");
        }
        
    }
    
}
