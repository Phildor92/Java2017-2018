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
public class Exercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size;
        int baseWidth;
        int baseHeight;
        boolean repeat = true;

        while (repeat) {
            Scanner key = new Scanner(System.in);
            System.out.print("Enter tree width: ");
            size = key.nextInt();

            System.out.print("Enter base width: ");
            baseWidth = key.nextInt();

            System.out.print("Enter base height: ");
            baseHeight = key.nextInt();

            printTree(size);
            printBase(baseWidth, baseHeight, size);

            System.out.print("End? (y/n)");
            if (key.next().equals("y")) {
                repeat = false;
            }
        }
    }

    private static void printTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i + j) > size) {
                    System.out.print("X");
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printBase(int baseWidth, int baseHeight, int size) {
        for (int i = 0; i < baseHeight; i++) {
            for (int j = 0; j < size - baseWidth - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < baseWidth; k++) {
                System.out.print(" " + "X");
            }
            System.out.println();
        }
    }

}
