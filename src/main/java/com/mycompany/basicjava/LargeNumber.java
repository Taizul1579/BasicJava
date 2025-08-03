
package com.mycompany.basicjava;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        int Number1,Number2,Number3;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        Number1 = input.nextInt();
        
        System.out.print("Enter The Second Number: ");
        Number2 = input.nextInt();
        
        System.out.print("Enter The Third Number: ");
        Number3 = input.nextInt();
        if(Number1>Number2 && Number1>Number3){
            System.out.print("Big Number is: "+Number1);
         
        }
        else if(Number2>Number3 && Number2> Number1){
        System.out.print("Big Number is:"+Number2);
        
    }
        else
            System.out.print("Large Number is: "+Number3);
                
    }
    
}
