
package com.mycompany.basicjava;
import java.util.Scanner;

public class LogicalAnd {
    public static void main(String[] args) {
        char input;
        Scanner Input = new Scanner(System.in);
        System.out.print("Are you Complete masters? Y/N  :");
        input = Input.next().charAt(0);
        if(input=='y' || input=='Y'){
            System.out.print("Your are eligible!");
            
                    
        }
        else{
            System.out.print("Sorry!");
        }
                
        
    }
    
}
