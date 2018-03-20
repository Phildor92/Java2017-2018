/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises8;

/**
 *
 * @author Philip Evans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening(1000, "Mhr Janssen", "012-5248-1200");
        Rekening rekening2 = new Rekening(2000, "Mhr Smit", "054-7888-3578");
        
        BankVerrichting.overschrijven(rekening2, rekening1, 1);
        System.out.println(rekening2.toString() + " & " + rekening1.toString());
        BankVerrichting.overschrijven(rekening2, rekening1, 11);
        System.out.println(rekening2.toString() + " & " + rekening1.toString());
        BankVerrichting.overschrijven(rekening2, rekening1, 3000);
        System.out.println(rekening2.toString() + " & " + rekening1.toString());
        
        double bedrag = 0;
        do
        {
            bedrag = -10;
        } while(bedrag > -1);
    }
    
}
