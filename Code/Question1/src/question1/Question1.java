/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author geek
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        System.out.println("First 10 numbers in the Fibonacci sequence");
        while (n <= 10) {            
            System.out.println(fibonacci(n));
            n++;
        }
    }
    
    public static int fibonacci(int n) {
        if (n < 2) return 1;
        return fibonacci(n -1) + fibonacci(n - 2);
    }
}
