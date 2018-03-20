/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

import java.util.Random;

/**
 *
 * @author Philip Evans
 */
public class Exercises7 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double[][] dagTemp = new double[7][3];
        Random rand = new Random();
        double totaalAlleDagen =0;
        for(int i = 0; i< dagTemp.length; i++){
            double totaalPerDag = 0;
            System.out.println("\r\nDag " + (i+1));
            for(int j = 0; j<dagTemp[i].length; j++){
                dagTemp[i][j] = rand.nextDouble()*15;
                System.out.println(dagTemp[i][j]);
                totaalPerDag += dagTemp[i][j];
            }
            double gemiddeldeDag = totaalPerDag/dagTemp[i].length;
            totaalAlleDagen += totaalPerDag;
            System.out.println("Gemiddelde dag " + i + ": " + gemiddeldeDag);
        }
        double gemiddeldeTotal = totaalAlleDagen / dagTemp.length;
        System.out.println("\r\nGemiddelde week: " + ((Math.round(gemiddeldeTotal * 100))/100));
    }
}
