
package com.mycompany.basicjava;

public class IfElse {
    public static void main(String[] args) {
        int a= 1000, b =40, c= 10;
        
        if(a>b && a>c){
            System.out.println("Big No is a");
        }
        else if(b>c && b>a){
            System.out.println("Big No is b");
        }
        
        else{
            System.out.println("Big No is c");
        }
    }
    
}
