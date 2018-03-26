/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises7opdracht;

/**
 *
 * @author Philip Evans
 */
public class Publicatie {
    private String titel;
    private static int huidigePubNr;
    private int pubnr;
    
    
    public Publicatie(String titel){
        this.titel = titel;
        this.pubnr = huidigePubNr;
        huidigePubNr++;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getPubnr() {
        return pubnr;
    }

    public void setPubnr(int pubnr) {
        this.pubnr = pubnr;
    }
    
    public static void setStartPubNr(int startNr){
        huidigePubNr = startNr;
    }
}
