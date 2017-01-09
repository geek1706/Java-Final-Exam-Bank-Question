/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 *
 * @author geek
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input;
        char character;        
        Scanner scanner = new Scanner(System.in);
        int frequency = 0;
        
        System.out.println("Enter a string");
        input = scanner.nextLine();
        
        System.out.println("Enter charater to find:");
        character = scanner.next().charAt(0);
        
        for (int i = 0; i < input.chars().count(); i++) {
            if (input.charAt(i) == character) {
                frequency += 1;
            }
        }
        
        System.out.println("Frequency of character " + character + ": " + frequency);
    }
    
}
