/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author geek
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {30, 10, 3, 0, 21}; 
        
        int sum = 0;
        int average;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
              
        average = sum/arr.length;
        
        System.out.println("Average: " + average);
    }
}
