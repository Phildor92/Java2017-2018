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
public class Exercises8 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] voorraad;
        String[] kleuren = new String[]{"ROOD", "WIT", "BLAUW", "ORANJE", "ZWART"};
        String[] maten = new String[]{"SMALL", "MEDIUM", "LARGE"};
        int laagsteVoorraad = 1000;
        int hoogsteVoorraad = 0;
        int laagsteVoorraadX = 0, hoogsteVoorraadX= 0, laagsteVoorraadY= 0, hoogsteVoorraadY= 0;
        int som = 0;

        //voorraad = this.OpvullenRand();
        voorraad = OpvullenVast();
        for (int i = 0; i < voorraad.length; i++) {
            for (int j = 0; j < voorraad[i].length; j++) {
                som += voorraad[i][j];
                //System.out.println(voorraad[i][j]);
                if(voorraad[i][j] < laagsteVoorraad && voorraad[i][j] > 0){
                    laagsteVoorraad = voorraad[i][j];
                    laagsteVoorraadX = i;
                    laagsteVoorraadY = j;
                } else if (voorraad[i][j] > hoogsteVoorraad){
                    hoogsteVoorraad = voorraad[i][j];
                    hoogsteVoorraadX = i;
                    hoogsteVoorraadY = j;
                }
            }
            System.out.println("Totaal " + maten[i] + " : " + som);
            som = 0;
        }
        System.out.println("");

        for (int i = 0; i < kleuren.length; i++) {
            for (int j = 0; j < maten.length; j++) {
                som += voorraad[j][i];
                //System.out.println(voorraad[j][i]);
            }
            System.out.println("Totaal " + kleuren[i] + ": " + som);
            som = 0;
        }
        
        System.out.println("");
        System.out.println("Laagste voorraad: kleur=" + maten[laagsteVoorraadX] + ", maat=" + kleuren[hoogsteVoorraadY] + ", aantal=" + laagsteVoorraad);
        System.out.println("Hoogste voorraad: kleur=" + maten[hoogsteVoorraadX] + ", maat=" + kleuren[hoogsteVoorraadY] + ", aantal=" + hoogsteVoorraad);
    }

    /**
     *
     * @return
     */
    public static int[][] OpvullenRand() {
        int[][] voorraad = new int[3][5];
        for (int i = 0; i < voorraad.length; i++) {
            for (int j = 0; j < voorraad[i].length; j++) {
                voorraad[i][j] = (int) (Math.random() * 100);
            }
        }
        return voorraad;
    }

    private static int[][] OpvullenVast() {
        int[][] voorraad = new int[3][];

        voorraad[0] = new int[]{45, 102, 19, 55, 0};
        voorraad[1] = new int[]{79, 47, 58, 55, 46};
        voorraad[2] = new int[]{109, 33, 112, 0, 0};

        return voorraad;
    }
}
