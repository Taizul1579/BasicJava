
package com.mycompany.basicjava;
import java.util.Scanner;
public class AreaOfTraingleAndCircle {
    private static void main(String [] args){
        float Area;
        int Height;
        int Width;
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Enter Height: ");
        Height = Input.nextInt();
        System.out.println("Enter width: ");
        Width = Input.nextInt();
        Area = 0.5f*Height*Width;
        System.out.println("Area Is: "+Area);
        
    }
    
}
