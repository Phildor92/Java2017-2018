/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

import java.util.Scanner;

/**
 *
 * @author Philip Evans
 */
public class Exercises3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Fibonacci
        
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        
        selectFromFibonacci(num);
        for(int i =1; i <=15; i++)
        {
            System.out.println(i + " : " + recursiveFibonacci(i));
        }
    }

    private static void selectFromFibonacci(int num) {
        int fib1 = 0;
        int fib2 = 0;
        int fib3 = 1;

        for(int i = 0; i<num; i++){
            fib1 = fib2 + fib3;
            fib3 = fib2;
            fib2 = fib1;  
            System.out.println("number " + (i+1) + " is: " + fib1);
        }
    }

    private static int recursiveFibonacci(int i) {
        return i <=2? 1 : recursiveFibonacci(i-2) + recursiveFibonacci(i-1);
    }
    
    
}
