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
public class BankVerrichting {
    public static void overschrijven(Rekening rekeningVan, Rekening rekeningNaar, double bedrag)  {
        double preFrom = rekeningVan.getSaldo();
        double preTo = rekeningNaar.getSaldo();
        try 
        {           
            rekeningVan.afhalen(bedrag);
            rekeningNaar.storten(bedrag);
        }
        catch (BankVerrichtingFout f){
            System.out.println(f.getMelding() + " Transactie mislukt.");
            rekeningVan.setSaldo(preFrom);
            rekeningNaar.setSaldo(preTo);
        }
    }
}
