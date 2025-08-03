
package com.mycompany.basicjava;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char input;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        input = Input.next().charAt(0);
        if( input == 'a' ||input == 'e' ||input == 'i' ||input == 'o' || input == 'u' ||input == 'A' ||input == 'E' ||input == 'I' ||input == 'O' || input == 'U'){
        System.out.println("This is vowel");
    }
        else{
                System.out.println("This is consonant");
                }
    }
    
}
