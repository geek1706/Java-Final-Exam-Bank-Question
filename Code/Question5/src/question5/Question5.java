/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author geek
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        
        while (n <= 10) {            
            System.out.println(n + "! = " + factorial(n));
            n++;
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
