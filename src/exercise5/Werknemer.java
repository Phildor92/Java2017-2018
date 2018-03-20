/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Philip Evans
 */
public abstract class Werknemer implements Verloning {
    private int nummer;
    private String naam, afdeling;
    private double loon;
    
    public Werknemer(int nummer, String naam, String afdeling){
        this.nummer = nummer;
        this.naam = naam;
        this.afdeling = afdeling;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(String afdeling) {
        this.afdeling = afdeling;
    }

    public double getLoon() {
        return loon;
    }

    public void setLoon(double loon) {
        this.loon = loon;
    }
    
    public String getInfo(){
        return this.getNummer() + " " + this.getNaam() + " (" + this.getAfdeling() + ")";
    }
}
