/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

/**
 *
 * @author Philip Evans
 */
public class Exercises4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Factorial
        int num = 5;
        System.out.println(getFactorial(num) + "");
    }

    private static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int fact = 1; // this  will be the result
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
