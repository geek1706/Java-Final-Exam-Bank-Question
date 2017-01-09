/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author geek
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input;
        String result = null;
        char character;        
        Scanner scanner = new Scanner(System.in);
        int frequency = 0;
        
        System.out.println("Enter a string");
        input = scanner.nextLine();
        
        System.out.println("Enter charater to replace:");
        character = scanner.next().charAt(0);
        
        
        
        for (int i = 0; i < input.chars().count(); i++) {
            if (input.charAt(i) == character) {
               result = input.replace(input.charAt(i), '?');
            }
        }
        
        System.out.println("Result: " + (result == null ? input : result));
    }
    
}
