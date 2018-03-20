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
public class Tijdschrift extends Publicatie {
    private int frequentie;
    
    public Tijdschrift(String titel, int nr){
        super(titel);
        this.frequentie = nr;
    }

    public int getFrequentie() {
        return frequentie;
    }

    public void setFrequentie(int frequentie) {
        this.frequentie = frequentie;
    }
    
    @Override
    public String toString(){
        
        return this.getTitel() + " - frequentie:" + this.getFrequentie();
    }
}
