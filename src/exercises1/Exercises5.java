/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Philip Evans
 */
public class Exercises5 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] getallen = new int[10];

        //getallen = fillArray();
        fillArray(getallen);
        System.out.println("");
        //getallen = sortArray(getallen);
        Arrays.sort(getallen);
        printArray(getallen);
    }

    private static int[] sortArray(int[] getallen) {
        int[] sortArray = getallen;
        for (int j = 0; j < getallen.length; j++) {
            for (int i = 1; i < getallen.length; i++) {
                if (getallen[i] < getallen[j]) {
                    int temp = getallen[i];
                    getallen[i] = getallen[j];
                    getallen[j] = temp;
                }
            }
        }

        return sortArray;
    }

    private static int[] fillArray() {
        Random rand = new Random();
        int[] getallen = new int[10];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = rand.nextInt(100);
            System.out.println(getallen[i]);
        }
        return getallen;
    }
    
    private static void fillArray(int[] nums) {
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
            System.out.println(nums[i]);
        }
    }

    private static void printArray(int[] getallen) {
        for (int g : getallen) {
            System.out.println(g);
        }
    }
}
