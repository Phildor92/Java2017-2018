/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises4;

/**
 *
 * @author Philip Evans
 */
public class exercise4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datum d1 = new Datum();
        Datum d2 = new Datum(15,2,2018);
        System.out.println(d1.geefDag());
        System.out.println(d1.show());
        System.out.println(d1.showLong());
        System.out.println(d1.geefVervaldatum(10).show());
        System.out.println(d1.geefAantalDagen(d2));
    }
    
}
