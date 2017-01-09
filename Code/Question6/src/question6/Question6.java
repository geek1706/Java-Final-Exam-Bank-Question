/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author geek
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {-30, 10, -3, 0, -21};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] < 0 ? arr[i] : 0;
        }
        
        System.out.println("Sum of all negative numbers in an array: " + sum);
    }

}
