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
    private int pubnr;
    
    public Publicatie(String titel){
        this.titel = titel;
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
    
    
}
