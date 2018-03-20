/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises2;

/**
 *
 * @author Philip Evans
 */
public class Person {
    private int nummer;
    private String naam, voornaam;
    
    public Person(){
        this.nummer = -1;
    }
    
    public Person(int nummer, String naam, String voornaam){
        this.nummer = nummer;
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        if(nummer > 0 && nummer < 10000) this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    
    
}
