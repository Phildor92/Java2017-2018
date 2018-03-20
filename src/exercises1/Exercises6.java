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
public class Exercises6 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String tekst = TekstLezen();
        int[] aantalChars = CharsTellen(tekst);
        printChars(aantalChars);
    }

    private static String TekstLezen() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Geef uw tekst in");
        String invoerTekst = kb.nextLine();
        return invoerTekst;
    }

    private static int[] CharsTellen(String tekst) {
        char[] TekstInChars = tekst.toLowerCase().toCharArray();
        int[] aantalLetters = new int[94];
        for(int i = 0; i<TekstInChars.length;i++){
            aantalLetters[(int)TekstInChars[i]-32]++;
            //System.out.println((int)TekstInChars[i]-97);  
        }       
        return aantalLetters;
    }

    private static void printChars(int[] aantalChars) {
        for(int i = 0; i<aantalChars.length; i++){
            if(aantalChars[i]>0){
                System.out.println((char)(i+32) + " komt " + aantalChars[i] + " keer voor.");
            } 
        }
    }
}
