/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.Scanner;

/**
 *
 * @author geek
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}