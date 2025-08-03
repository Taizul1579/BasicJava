
package com.mycompany.basicjava;
import java.util.Scanner;
public class TemparatureConvert {
    public static void main(String[] args) {
        double Celcius,Farenhight;
        Scanner Cel = new Scanner(System.in);
        System.out.print("Enter Celcius: ");
        Celcius = Cel.nextDouble();
  
        Farenhight = 1.8*Celcius+32;
        System.out.println("Farenhight is: "+Farenhight);
    }
    
}
